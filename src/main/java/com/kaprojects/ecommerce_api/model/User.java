package com.kaprojects.ecommerce_api.model;

import com.kaprojects.ecommerce_api.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class User {

    private UUID id;

    private String email; // equivalent to username

    private String password;

    private Role role;

    private LocalDateTime createdAt;



    public String getUsername() {
        return this.email;
    }


}
