package com.joker.dao;

import com.joker.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserJPASpecificationExecutor extends JpaSpecificationExecutor<User>, JpaRepository<User,Integer> {
}
