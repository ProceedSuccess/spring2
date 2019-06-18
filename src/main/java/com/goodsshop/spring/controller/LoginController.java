package com.goodsshop.spring.controller;

import com.goodsshop.spring.persist.model.User;
import com.goodsshop.spring.persist.repo.RoleRepository;
import com.goodsshop.spring.service.SystemUser;
import com.goodsshop.spring.service.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    private final RoleRepository roleRepository;

    private final UserService userService;

    @Autowired
    public LoginController(RoleRepository roleRepository,
                           @Lazy UserService userService) {
        this.roleRepository = roleRepository;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user",new SystemUser());
        return "login";
    }

    @PostMapping("/login")
    public String subscribe(@Valid SystemUser user, Model model, BindingResult bindingResult) {
        if (user.getUserName().equals("admin") & user.getPassword().equals("admin")){
            return "admin/index";
        }
//        User u = new User();
//        u.setUserName(user.getUserName());
//        model.addAttribute("user",u);
        return "index";
    }
}
