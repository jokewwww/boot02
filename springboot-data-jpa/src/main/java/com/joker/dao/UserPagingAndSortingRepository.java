package com.joker.dao;

import com.joker.pojo.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User,Integer> {
}
