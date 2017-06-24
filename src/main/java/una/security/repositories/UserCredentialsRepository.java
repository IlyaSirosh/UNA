package una.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.security.model.UserCredentials;

/**
 * Created by Illya on 6/24/17.
 */
public interface UserCredentialsRepository extends JpaRepository<UserCredentials,Long> {

//    UserCredentials findByEmail(String email);
    UserCredentials findByNickname(String nickname);
}
