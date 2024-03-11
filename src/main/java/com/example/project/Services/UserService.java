package com.example.project.Services;

import java.util.List;

import com.example.project.Entity.User;

public interface UserService {

List<User> getUser();

User getSingleUser(int id);

User saveUser(User user);

User updateUser(User user);

User deleteUser(User user);
}