package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.User;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
