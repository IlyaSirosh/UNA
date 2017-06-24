package una.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import una.security.jwt.JwtUserFactory;
import una.security.model.UserCredentials;
import una.security.repositories.UserCredentialsRepository;

/**
 * Created by Illya on 6/24/17.
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserCredentialsRepository userCredentialsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserCredentials user = userCredentialsRepository.findByNickname(username);

//        if( user == null)
//            user = userCredentialsRepository.findByEmail(username);

        if(user == null)
            throw new UsernameNotFoundException(String.format("Cannot find user with '%s' nickname",username));

        return JwtUserFactory.create(user);
    }
}
