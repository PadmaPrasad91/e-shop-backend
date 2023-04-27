package com.eshop.api.backend.models;

import com.eshop.api.backend.dao.entity.User;
import jakarta.persistence.Entity;
import lombok.*;

@Data
public class JwtResponse {

    private String accessToken;
    private String tokenType = "Bearer ";

    public JwtResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
