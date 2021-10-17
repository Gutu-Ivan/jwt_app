package dev.gutuivan.security.jwt;

import dev.gutuivan.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtTokenProvider {

    public String createToken(String username, List<Role> role){
        return null;
    }
    public Authentication getAuthentication(String token){
        return null;
    }
}
