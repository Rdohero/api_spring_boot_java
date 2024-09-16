package com.rest_api_spring_boot.services;

import com.rest_api_spring_boot.models.entities.User;
import com.rest_api_spring_boot.models.repos.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Iterable<User> getAll() {
        return userRepo.findAll();
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public User findByID(Long id) {
        return userRepo.findById(id).get();
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
    }

    public List<User> findByUsername(String username) {
        return userRepo.findByUsernameContains(username);
    }
}
