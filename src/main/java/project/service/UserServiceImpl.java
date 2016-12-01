package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import project.dao.RoleDao;
import project.dao.UserDao;
import project.model.Role;
import project.model.User;

import java.util.HashSet;
import java.util.Set;

/**Impl of {@link project.service.UserService}
 * @author R. Smolyakov
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1l));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUserName(String username) {
        return userDao.findByUsername(username);
    }
}
