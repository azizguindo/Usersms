package master.microservices.usersms.dao;

import master.microservices.usersms.model.User;
import java.util.List;

public interface IUserDAO {
    List<User> findAll();
    User findById(int id);
    void save (User user);
}
