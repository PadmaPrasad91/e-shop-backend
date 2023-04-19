package com.eshop.api.backend.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class User {

    @Id
    private String userName;

    private String firstName;

    private String lastName;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE", joinColumns = { @JoinColumn(name = "USER_ID") },inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
    private Set<Role> roles;
}
