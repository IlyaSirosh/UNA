package una;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import una.repositories.UserRepository;

/**
 * Created by Illya on 6/20/17.
 */

@SpringBootApplication
@EnableAutoConfiguration
public class Application {


    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }
}
