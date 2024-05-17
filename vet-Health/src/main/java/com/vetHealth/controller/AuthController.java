package com.vetHealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vetHealth.service.AuthService;
import com.vetHealth.modelo.*;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        boolean result = authService.login(request.getUsuario(), request.getPassword());
        if (result) {
            return "welcome";
        } else {
            return "login";
        }
    }
}
