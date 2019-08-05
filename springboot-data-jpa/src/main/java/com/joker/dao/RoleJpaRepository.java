package com.joker.dao;

import com.joker.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaRepository extends JpaRepository<Role,Integer> {
}
