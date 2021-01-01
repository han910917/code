package com.javaSharding.code.repository;

import com.javaSharding.code.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/29 19:18
 * @Version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByopenid(String openid);
}
