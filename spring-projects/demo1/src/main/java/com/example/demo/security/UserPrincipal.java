package com.example.demo.security;

public record UserPrincipal(
        String username,
        String role
) {
}