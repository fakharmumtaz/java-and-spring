package com.example.demo.filter;

import com.example.demo.security.UserPrincipal;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

@Component
public class TokenAuthenticationFilter
        extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        String authorization =
                request.getHeader("Authorization");

        if (authorization != null &&
                authorization.startsWith("Bearer ")) {

            String token =
                    authorization.substring(7);

            UserPrincipal principal = null;

            if ("admin-token".equals(token)) {

                principal = new UserPrincipal(
                        "admin",
                        "ADMIN"
                );

            } else if ("user-token".equals(token)) {

                principal = new UserPrincipal(
                        "john",
                        "USER"
                );
            }

            if (principal != null) {

                var authorities =
                        List.of(
                                new SimpleGrantedAuthority(
                                        "ROLE_" + principal.role()
                                )
                        );

                var authentication =
                        new UsernamePasswordAuthenticationToken(
                                principal,
                                null,
                                authorities
                        );

                SecurityContextHolder
                        .getContext()
                        .setAuthentication(authentication);
            }
        }

        filterChain.doFilter(request, response);
    }
}