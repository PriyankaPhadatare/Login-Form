package com.example.miniauthapp.controller;

import com.example.miniauthapp.model.User;
import com.example.miniauthapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3434")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        System.out.println("User registered: " + user.getFullName());
        
        // ✅ Save to database
        userRepository.save(user);
        
        return ResponseEntity.ok("User registered successfully");
    }
}
