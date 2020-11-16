package master.microservices.usersms.web.controller;

import master.microservices.usersms.dao.IUserDAO;
import master.microservices.usersms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserDAO dao;

    @GetMapping(value = "/Users")
    public List<User> getAllUsers(){
        return dao.findAll();
    }

    @GetMapping(value = "/User/{id}")
    public User getUser(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "Users")
    public void addUser(@RequestBody User user){
        dao.save(user);
    }
}
