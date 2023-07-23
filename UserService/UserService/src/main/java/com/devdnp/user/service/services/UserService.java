package com.devdnp.user.service.services;

import com.devdnp.user.service.entities.User;

import java.util.List;

public interface UserService {

    //User Operations

    //CREATE
    User saveUser(User user);

    //GET All Users
    List<User> getAllUsers();

    //GET Single User by UserId
    User getUser(String userId);

    //UPDATE User
    User updateUser(String userId, User user);

    //DELETE User
    void deleteUser(String userId);
}
