package com.eshop.api.backend.controller;

import com.eshop.api.backend.dao.entity.Role;
import com.eshop.api.backend.dao.entity.User;
import com.eshop.api.backend.service.RoleService;
import com.eshop.api.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/e-shop-backend/user-controller")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/admin")
    public String admin() {
        return "This URL only accessible for admin";
    }
    @GetMapping("/user")
    public String user() {
        return "This URL only accessible for user";
    }

}
