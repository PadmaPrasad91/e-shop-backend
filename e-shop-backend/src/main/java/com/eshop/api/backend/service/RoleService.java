package com.eshop.api.backend.service;

import com.eshop.api.backend.dao.entity.Role;
import com.eshop.api.backend.dao.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createRole(Role role) {
     return roleRepository.save(role);
    }
}
