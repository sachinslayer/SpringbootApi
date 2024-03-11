package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Entity.User;
import com.example.project.Services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService uService;


    @GetMapping("/users")
    public List<User> getUsers(){
        return uService.getUser();
    }
    @GetMapping("/user/{id}")
    public User getOneUser(@PathVariable int id){
        return uService.getSingleUser(id);
    }




    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return uService.saveUser(user);
    }

}
