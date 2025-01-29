package com.djqueue.service;

import com.djqueue.model.User;
import com.djqueue.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(User user) {
        // Check if passwords match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            throw new RuntimeException("Password and Confirm Password do not match");
        }

        // Check if email or username already exists
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already associated with an active account");
        }
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new RuntimeException("Username already taken");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return saveUser(user);
    }

    public boolean validateLogin(User loginUser) {
        Optional<User> existingUserOpt = findByUsername(loginUser.getUsername());

        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            return passwordEncoder.matches(loginUser.getPassword(), existingUser.getPassword());
        }
        return false; // Unable to find user with provided username
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}
