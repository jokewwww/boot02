package com.joker.dao;

import com.joker.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User,Integer> {
}
