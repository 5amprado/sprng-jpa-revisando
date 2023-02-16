package resumo.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import resumo.springdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
