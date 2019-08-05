package com.joker.test;

import com.joker.DataApplication;
import com.joker.dao.RoleJpaRepository;
import com.joker.pojo.Menu;
import com.joker.pojo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DataApplication.class)
public class ManyToManyTest {

  @Autowired private RoleJpaRepository roleJpaRepository;

  @Test
  public void test1() {
    // 创建角色队对象
    Role role = new Role();
    role.setRoleName("门卫大爷");
    // 创建菜单队对象
    Menu menu = new Menu("管理系统", "www.tom.com", 0);
    Menu menu1 = new Menu("项目管理", "www.baidu.com", 1);
    // 关联
    role.getMenus().add(menu);
    role.getMenus().add(menu1);

    menu.getRoles().add(role);
    menu1.getRoles().add(role);

    // 保存
    roleJpaRepository.save(role);
  }

  @Test
  public void test2(){
    Role role = roleJpaRepository.findById(2).get();
    System.out.println(role.getRoleName());

    Set<Menu> menus = role.getMenus();
    for (Menu menu:menus){
      System.out.println(menu);
    }
  }

}
