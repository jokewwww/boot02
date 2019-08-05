package com.joker.dao;

import com.joker.pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Integer> {
}
