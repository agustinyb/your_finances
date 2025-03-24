package com.yourfinances.services;

import com.yourfinances.Auth.AuthResponse;
import com.yourfinances.dto.LoginRequest;
import com.yourfinances.dto.RegisterRequest;

public interface AuthService{
AuthResponse login(LoginRequest request);
AuthResponse register(RegisterRequest request);
}