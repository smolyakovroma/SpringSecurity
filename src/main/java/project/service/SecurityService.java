package project.service;

import org.springframework.stereotype.Service;

/** Service for security
 * @author R. Smolyakov
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
