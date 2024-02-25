package com.shiva.opencommerceapi.controller;

import com.shiva.opencommerceapi.entity.UserEntity;
import com.shiva.opencommerceapi.repository.UserRepository;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.Optional;


@RestController
public class TestController {
    
    private final UserRepository userRepository;

    public TestController( UserRepository userRepository ){
        this.userRepository = userRepository;
    }

    @GetMapping("/test")
    public Optional<UserEntity> getUser(){
        return userRepository.findById(UUID.randomUUID());
    }

}
