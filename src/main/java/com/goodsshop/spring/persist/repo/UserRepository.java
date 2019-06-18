package com.goodsshop.spring.persist.repo;

import com.goodsshop.spring.persist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User u join fetch u.roles r where u.userName = :userName")
    User findOneByUserName(String userName);
}
