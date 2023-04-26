package com.eshop.api.backend.controller;

import com.eshop.api.backend.models.JwtRequest;
import com.eshop.api.backend.models.JwtResponse;
import com.eshop.api.backend.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/e-shop-backend/jwt-controller")
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}
