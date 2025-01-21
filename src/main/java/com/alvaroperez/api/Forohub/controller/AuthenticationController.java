package com.alvaroperez.api.Forohub.controller;

import com.alvaroperez.api.Forohub.domain.user.DTO.UserDataAuthentication;
import com.alvaroperez.api.Forohub.domain.user.User;
import com.alvaroperez.api.Forohub.infra.security.DTO.DataJWToken;
import com.alvaroperez.api.Forohub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid UserDataAuthentication userDataAuthentication) {
        Authentication authenticationToken = new UsernamePasswordAuthenticationToken(userDataAuthentication.email(), userDataAuthentication.password());
        var userAuthenticated = authenticationManager.authenticate(authenticationToken);
        var JWToken = tokenService.generate((User) userAuthenticated.getPrincipal());
        return ResponseEntity.ok(new DataJWToken(JWToken));
    }
}
