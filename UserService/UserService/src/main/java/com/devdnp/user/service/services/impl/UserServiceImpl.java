package com.devdnp.user.service.services.impl;

import com.devdnp.user.service.entities.User;
import com.devdnp.user.service.exceptions.ResourceNotFoundException;
import com.devdnp.user.service.repositories.UserRepository;
import com.devdnp.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->
                new ResourceNotFoundException("User with given Id: "+userId+" not found on server !!"));
    }

    @Override
    public User updateUser(String userId, User user) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }
}
