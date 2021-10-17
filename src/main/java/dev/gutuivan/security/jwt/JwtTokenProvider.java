package dev.gutuivan.security.jwt;

import dev.gutuivan.model.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JwtTokenProvider {
    @Value("${jwt.token.secret}")
    private String secret;
    @Value("${jwt.token.expired}")
    private long validityInMiliseconds;

    public String createToken(String username, List<Role> role){
        return null;
    }
    public Authentication getAuthentication(String token){
        return null;
    }
    public String getUserName (String token){
        return null;
    }
    public Boolean validateToken(String token){
        return null;
    }
    private List<String> getRoleNames(List<Role> userRoles){
        List<String> result = new ArrayList<>();
        userRoles.forEach(role -> {
            result.add(role.getName());
        });
        return result;
    }
}
