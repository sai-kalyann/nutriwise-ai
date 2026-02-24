package com.nutriwise.auth_service.auth.dto;

import java.util.UUID;

public record AuthResponse(
        UUID userId,
        String email,
        String role,
        String token // for now we put "dummy" token; next step we generate real JWT
) {}
