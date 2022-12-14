package com.ng.springbootmicroservice3gateway.service;

import com.ng.springbootmicroservice3gateway.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByUsername(String username);

    List<User> findAllUsers();
}
