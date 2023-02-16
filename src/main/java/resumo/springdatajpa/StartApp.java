package resumo.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import resumo.springdatajpa.model.User;
import resumo.springdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Sam");
        user.setPassword("s123");
        user.setUsername("o5am");

        userRepository.save(user);

        for(User u: userRepository.findAll()){
            System.out.println(u);
        }
    }
}
