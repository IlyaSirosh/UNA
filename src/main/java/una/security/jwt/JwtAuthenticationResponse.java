package una.security.jwt;

import java.io.Serializable;

/**
 * Created by Illya on 6/24/17.
 */
public class JwtAuthenticationResponse implements Serializable{

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
