package com.ryulth.board.controller;

import com.ryulth.board.dto.User;
import com.ryulth.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }
}