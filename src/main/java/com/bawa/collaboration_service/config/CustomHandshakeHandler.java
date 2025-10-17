package com.bawa.collaboration_service.config;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.security.Principal;
import java.util.List;
import java.util.Map;

public class CustomHandshakeHandler extends DefaultHandshakeHandler {
    @Override
    protected Principal determineUser(ServerHttpRequest request,
                                      WebSocketHandler wsHandler,
                                      Map<String, Object> attributes) {
        // Extract userId header
        List<String> userHeader = request.getHeaders().get("userId");
        String userId = (userHeader != null && !userHeader.isEmpty())
                ? userHeader.get(0)
                : "anonymous";

        String finalUserId = userId;
        return () -> finalUserId;
    }
}
