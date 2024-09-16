package com.rest_api_spring_boot.models.repos;

import com.rest_api_spring_boot.models.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findByUsernameContains (String username);
}
