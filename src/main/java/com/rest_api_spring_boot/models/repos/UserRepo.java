package com.rest_api_spring_boot.models.repos;

import com.rest_api_spring_boot.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
