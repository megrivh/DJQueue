package com.djqueue.controller;

import com.djqueue.model.User;
import com.djqueue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;

import jakarta.validation.Valid;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // API endpoint: Register a new user with validation
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            StringBuilder errors = new StringBuilder();
            result.getAllErrors().forEach(error -> errors.append(error.getDefaultMessage()).append("\n"));
            return ResponseEntity.badRequest().body("Validation failed: " + errors.toString());
        }

        try {
            userService.createUser(user);
            return ResponseEntity.ok("User registered successfully!");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("An unexpected error occurred.");
        }
    }

    // API endpoint: User login
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        if (userService.validateLogin(user)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Login unsuccessful: Invalid username or password");
        }
    }

    // API endpoint: Get data of logged-in user
    @GetMapping("/me")
    public ResponseEntity<User> getCurrentUser(Authentication authentication) {
        String username = authentication.getName();
        Optional<User> user = userService.findByUsername(username);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
