package com.cab.service.cab.service;

import com.cab.service.cab.entitiy.Driver;
import com.cab.service.cab.entitiy.User;
import com.cab.service.cab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
