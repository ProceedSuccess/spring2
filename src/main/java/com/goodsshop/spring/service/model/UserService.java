package com.goodsshop.spring.service.model;

import com.goodsshop.spring.service.SystemUser;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {

    SystemUser findById(Long id);

    SystemUser findByUserName(String username);

    boolean save(SystemUser systemUser);

    List<SystemUser> findAll();
}