package com.example.crudeSecurity.controller;

import com.example.crudeSecurity.model.User;
import com.example.crudeSecurity.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController{

    @Autowired
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> userData = userService.getAllUser();

        return new ResponseEntity<>(userData, HttpStatus.OK);
    }



}
