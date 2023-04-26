package com.eshop.api.backend.models;

import com.eshop.api.backend.dao.entity.User;
import jakarta.persistence.Entity;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class JwtResponse {

    private User user;
    private String jwtToken;
}
