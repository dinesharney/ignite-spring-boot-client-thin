package com.example.ignite.client.dto;

import lombok.Data;

/**
 * DTO classes for API communication.
 */
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    // Getters and setters
}
