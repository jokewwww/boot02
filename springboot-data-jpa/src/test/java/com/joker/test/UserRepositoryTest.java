package com.joker.test;


import com.joker.DataApplication;
import com.joker.dao.*;
import com.joker.pojo.User;
import org.assertj.core.internal.Predicates;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;



@SpringBootTest(classes= {DataApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Autowired
    UserRepositoryByName userRepositoryByName;

    @Autowired
    UserRepositoryQuery userRepositoryQuery;

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Autowired
    private UserPagingAndSortingRepository userPagingAndSortingRepository;

    @Autowired
    private UserJPASpecificationExecutor specificationExecutor;

    @Test
    public void testSave(){
        User user = new User("lisi", 13, "乌鲁木猪");
        repository.save(user);
    }

    @Test
    public void test1(){
        List<User> byName = userRepositoryByName.findByName("zhangsan");

        for (User user:byName ) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        List<User> byName = userRepositoryByName.findByNameAndAge("zhangsan", 23);

        for (User user:byName ) {
            System.out.println(user);
        }
    }

    @Test
    public void test3(){
        List<User> like = userRepositoryByName.findByNameLike("zhang%");

        for (User user :like ) {
            System.out.println(user);
        }
    }

    /**
     * @Query的测试
     */
    @Test
    public void test4(){
        List<User> zhangsan = userRepositoryQuery.queryByNameHQL("zhangsan");
        for (User user :zhangsan ) {
            System.out.println(user);
        }
    }

    @Test
    public void test5(){
        List<User> queryByNamSQL = userRepositoryQuery.queryByNamSQL("zhangsan");
        for (User user :queryByNamSQL ) {
            System.out.println(user);
        }
    }

    @Test
    @Transactional
    @Rollback(false)
    public void test6(){

        userRepositoryQuery.updateNameById("zhangliu",2);
    }

    @Test
    public void test7(){
        User user = new User("liwang", 24, "太平洋");
        user.setId(3);
        userCrudRepository.save(user);
    }

    @Test
    public void test8(){
        User user = userCrudRepository.findById(2).get();
        System.out.println(user);
    }

    @Test
    public void test9(){
        Iterable<User> all = userCrudRepository.findAll();
        for (User user :all ) {
            System.out.println(user);
        }

    }

    @Test
    public void test10(){
        userCrudRepository.deleteById(2);
    }

    @Test
    public void test11(){
        Order order=new Order(Direction.DESC,"id");
        Sort sort=new Sort(order);
        List<User> all = (List<User>)userPagingAndSortingRepository.findAll(sort);
        for (User suer :all ) {
            System.out.println(suer);
        }
    }

    @Test
    public void test12(){
        Pageable request = new PageRequest(1, 2);


        Page<User> all = userPagingAndSortingRepository.findAll(request);
        System.out.println("总条数:"+all.getTotalElements());
        System.out.println("总页数:"+all.getTotalPages());
        List<User> content = all.getContent();

        for (User user :content ) {
            System.out.println(user);
        }
    }

    @Test
    public void test13(){
        Sort sort=new Sort(new Order(Direction.DESC,"id"));

        Pageable page=new PageRequest(0,2,sort);

        Page<User> pagingAndSorting= userPagingAndSortingRepository.findAll(page);
        List<User> content = pagingAndSorting.getContent();
        for (User user :content ) {
            System.out.println(user);
        }

    }

    @Test
    public void test14(){

        Order order=new Order(Direction.DESC,"id");
        Sort sort=new Sort(order);
        List<User> users = repository.findAll(sort);
        for (User user:users ) {
            System.out.println(user);
        }
    }

    /**
     * UserJPASpecificationExecutor 单条件查询
     */
    @Test
    public void test15(){
        Specification<User> specification = new Specification<User>() {
            /**
             *
             * @param root :查询对象的属性的封装
             * @param criteriaQuery :封装了我们要执行的拆线呢的各个部分的信息(select,from)
             * @param criteriaBuilder: 查询条件的构造器,定义不同的查询条件
             * @return
             */
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate predicate = criteriaBuilder.equal(root.get("name"), "zhangsan");
                return predicate;
            }
        };
        List<User> userList = specificationExecutor.findAll(specification);

        for (User user :userList ) {
            System.out.println(user);
        }
    }


    /**
     * 多条件拆查询
     */
    @Test
    public void test16(){
        Specification<User> specification = new Specification<User>() {

            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list=new ArrayList();
                list.add(criteriaBuilder.equal(root.get("name"),"zhangsan"));
                list.add(criteriaBuilder.equal(root.get("id"),1));

                Predicate[] arr=new Predicate[list.size()];

                return criteriaBuilder.and(list.toArray(arr));

            }


        };
        List<User> specificationExecutorAll = specificationExecutor.findAll(specification);

        for (User user :specificationExecutorAll ) {
            System.out.println(user);
        }
    }




}
