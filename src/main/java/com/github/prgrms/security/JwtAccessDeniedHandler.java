package com.github.prgrms.security;

import jakarta.servlet.ServletException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {

    static String _403 = "{\"success\":false,\"response\":null,\"error\":{\"message\":\"Forbidden\",\"status\":403}}";

    @Override
    public void handle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setHeader("content-type", "application/json");
        response.getWriter().write(_403);
        response.getWriter().flush();
        response.getWriter().close();
    }
}