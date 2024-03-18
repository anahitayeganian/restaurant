package com.ay.restaurant.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Integer id;
    private String name;
    private String email;
    private String contactNumber;
    private String status;
    private String role;

    public UserDto(Integer id, String name, String email, String contactNumber, String status, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.status = status;
        this.role = role;
    }
}