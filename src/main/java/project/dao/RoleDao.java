package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
