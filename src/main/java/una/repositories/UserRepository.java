package una.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import una.model.User;

/**
 * Created by Illya on 6/21/17.
 */
public interface UserRepository extends JpaRepository<User,Long>{

    User findByEmail(String email);
    User findByNickname(String nickname);
}
