package com.kata.preproject.PP_3_1_2_SpringBoot.service;

import com.kata.preproject.PP_3_1_2_SpringBoot.models.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void update(User user);
    void delete(Long id);
    User getUserByUsername(String username);


}

