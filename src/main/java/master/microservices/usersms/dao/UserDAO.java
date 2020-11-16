package master.microservices.usersms.dao;

import master.microservices.usersms.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDAO implements IUserDAO{

    private List<User> users = new ArrayList<>(Arrays.asList(
            new User(1,"Guindo","Aziz",22)
    ));
    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id ).findFirst().get();
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
