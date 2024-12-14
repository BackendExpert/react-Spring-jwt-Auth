package com.jehan.server.model;

public class AuthResponse {
    private String token;  // JWT token

    public AuthResponse(String token) {
        this.token = token;
    }

    // Getter
    public String getToken() {
        return token;
    }
}
