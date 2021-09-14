package com.codesoom.assignment.application;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class AuthenticationService {
    public String login() {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        return Jwts.builder()
                .claim("userId", 1L)
                .signWith(key)
                .compact();

    }
}
