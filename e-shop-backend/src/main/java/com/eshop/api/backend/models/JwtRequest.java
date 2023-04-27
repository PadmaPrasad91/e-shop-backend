package com.eshop.api.backend.models;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class JwtRequest {

    private String userName;
    private String password;
}
