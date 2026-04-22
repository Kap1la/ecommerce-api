package com.kaprojects.ecommerce_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthRequest {

    @NotBlank(message = "E-mail is required")
    @Email(message = "Must be a valid e-mail address")
    private String email;

    @NotBlank(message = "Password is required")
    // TODO: add more conditions, such as capitals, numbers, and special chars to password
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
}
