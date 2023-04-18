package com.eshop.api.backend.controller;

import com.eshop.api.backend.dao.entity.Role;
import com.eshop.api.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/e-shop-backend/role-controller")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create-role")
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }
}
