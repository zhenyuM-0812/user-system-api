package com.example.usersystemapi.controller;

import com.example.usersystemapi.dto.UserResponseDto;
import com.example.usersystemapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getById(@PathVariable Long id){
        UserResponseDto user = userService.getById(id);
        return ResponseEntity.ok(user);
    }


    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        List<UserResponseDto> user = userService.getAllUsers();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserResponseDto>> searchByDepartment(@RequestParam String department){
        List<UserResponseDto> user = userService.searchByDepartment(department);
        return ResponseEntity.ok(user);
    }














}
