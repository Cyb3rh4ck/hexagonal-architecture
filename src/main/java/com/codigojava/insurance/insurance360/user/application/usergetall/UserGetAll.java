package com.codigojava.insurance.insurance360.user.application.usergetall;

import java.util.List;

import com.codigojava.insurance.insurance360.user.domain.User;
import com.codigojava.insurance.insurance360.user.domain.UserRepository;

public class UserGetAll {
    private UserRepository userRepository;

    public UserGetAll(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findAll();
    }

}
