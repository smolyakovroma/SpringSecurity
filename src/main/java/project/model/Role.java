package project.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * Simple JavaBean of {@link User}
 * @author Roman Smolyakov
 * @version 1.0
 */
@Entity
@Data
@Table(name = "roles")
@ToString(of = {"id","name","users"})
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
