package com.henry.service;

import com.henry.entity.User;
import com.henry.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(String name, int age) {
        return userRepository.save(new User(name, age));
    }
}
