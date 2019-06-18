package com.goodsshop.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/checkout")
    public String checkoutPage() {
        return "checkout";
    }

    @GetMapping("/product")
    public String productPage() {
        return "product";
    }

    @GetMapping("/store")
    public String storePage() {
        return "store";
    }

    @GetMapping("/redirect-to-login-page")
    public String getLog() {
        return "login";
    }


}

