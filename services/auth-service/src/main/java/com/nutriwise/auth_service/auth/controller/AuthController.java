package com.nutriwise.auth_service.auth.controller;

import com.nutriwise.auth_service.auth.dto.AuthResponse;
import com.nutriwise.auth_service.auth.dto.LoginRequest;
import com.nutriwise.auth_service.auth.dto.RegisterRequest;
import com.nutriwise.auth_service.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthResponse register(@Valid @RequestBody RegisterRequest req) {
        return authService.register(req);
    }

    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest req) {
        return authService.login(req);
    }
}

