package com.example.project.Repository;
import com.example.project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends  JpaRepository<User, Integer> {
    
}
