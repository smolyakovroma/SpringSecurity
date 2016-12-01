package project.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author R.Smolyakov
 * @version 1.0
 */

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1931046044264614710L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    @Transient
    transient private String confirmPassword;
    @ManyToMany()
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name="user_id")
    ,inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
