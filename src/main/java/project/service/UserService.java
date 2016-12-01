package project.service;

import org.springframework.stereotype.Service;
import project.model.User;

/**
 * Service class for {@link User}
 * @author R. Smolyakov
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUserName(String username);
}
