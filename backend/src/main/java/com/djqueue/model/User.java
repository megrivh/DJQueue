package com.djqueue.model;

import jakarta.persistence.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Transient
    private final PasswordEncoder passwordEncoder;

    public User(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    // @PrePersist executed before the entity is saved to database
    public void prePersist() {
        // Hash password before persisting
        if (this.password != null && !this.password.isEmpty()) {
            this.password = passwordEncoder.encode(this.password);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
