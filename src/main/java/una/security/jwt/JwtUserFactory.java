package una.security.jwt;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import una.security.model.UserCredentials;

import java.util.Collection;

/**
 * Created by Illya on 6/24/17.
 */
public class JwtUserFactory {

    public static UserDetails create(UserCredentials u){
        return new JwtUser( u.getId(),
                            u.getNickname(),
                            u.getEmail(),
                            u.getPassword(),
                            u.getAuthorities(),
                            u.getEnabled(),
                            u.getLastPasswordResetDate());
    }


}
