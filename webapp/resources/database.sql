drop TABLE IF EXISTS user_roles;
drop TABLE IF EXISTS users;
drop TABLE IF EXISTS roles;

CREATE TABLE users(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL
) ENGINE =InnoDB;

CREATE TABLE roles(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
) ENGINE =InnoDB;


CREATE TABLE user_roles (
  user_id int NOT NULL,
  roles_id int NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (roles_id) REFERENCES roles(id),
  UNIQUE (user_id, roles_id)
) ENGINE =InnoDB;

INSERT INTO users VALUES (1, 'admin', '$2a$08$q.7jwFoBSRDj0ZUgDbASuufT.iwqywGxsWR3/YPHR0LK7NHGpL9EK');
INSERT INTO roles  VALUES (1,'ROLE_USER');
INSERT INTO roles VALUES (2,'ROLE_ADMIN');
INSERT INTO users VALUES (2, 'user', '$2a$08$fq96WzNf8hBfMO34FPyloeToqqgsJDlRQ3YYywaJ7zDW9r9MyNjK.');


INSERT INTO user_roles VALUES (1,2);
INSERT INTO user_roles VALUES (2,1);