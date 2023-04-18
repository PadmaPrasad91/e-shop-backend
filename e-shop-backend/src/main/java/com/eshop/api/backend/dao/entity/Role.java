package com.eshop.api.backend.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Role {

    @Id
    private String roleName;

    private String roleDescription;
}
