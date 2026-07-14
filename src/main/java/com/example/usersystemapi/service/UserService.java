package com.example.usersystemapi.service;

import com.example.usersystemapi.dto.UserRequestDto;
import com.example.usersystemapi.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto createUser(UserRequestDto request);

    UserResponseDto getUserById(Long id);

    List<UserResponseDto> getAllUsers();

    void deleteUser(Long id);

    UserResponseDto updateUser(Long id, UserRequestDto request);

    List<UserResponseDto> searchByFirstName(String firstName);

    List<UserResponseDto> searchByLastName(String lastName);

    List<UserResponseDto> searchByDepartment(String department);

    List<UserResponseDto> getYoungerUsers(int threshold);
}
