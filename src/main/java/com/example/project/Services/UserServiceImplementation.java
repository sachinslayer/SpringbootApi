package com.example.project.Services;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entity.User;
import com.example.project.Repository.UserRepo;

@Service
public class UserServiceImplementation implements UserService{

@Autowired
    private UserRepo uRepo;

    public List<User> getUser(){
        return uRepo.findAll();
    }


    @SuppressWarnings("null")
    @Override
    public User saveUser(User user) {
        
        return uRepo.save(user);
        
    }

    @Override
    public User updateUser(User user) {
       return user;
    }

    @Override
    public User deleteUser(User user) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }


    @Override
    public User getSingleUser(int id) {
        Optional<User> user=uRepo.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        throw new RuntimeException("User not found for the  id"+ id);
  

}
}