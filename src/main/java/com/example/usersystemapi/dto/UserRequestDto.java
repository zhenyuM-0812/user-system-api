package com.example.usersystemapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserRequestDto {
    @NotBlank(message = "Name is required")
    @Size(max = 200, message = "Last name is too long")
    private String lastName;

    @NotBlank(message = "Name is required")
    @Size(max = 200, message = "Fisrst name is too long")
    private String firstName;

    @NotBlank(message = "Age is required")
    @Min(value =0 , message = "Age can not be negative")
    private Integer age;

    @NotBlank(message = "Department is required")
    private String department;


}