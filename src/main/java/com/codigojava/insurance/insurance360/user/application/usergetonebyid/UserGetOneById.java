package com.codigojava.insurance.insurance360.user.application.usergetonebyid;

import com.codigojava.insurance.insurance360.user.domain.User;
import com.codigojava.insurance.insurance360.user.domain.UserRepository;

public class UserGetOneById {
    private UserRepository userRepository;

    public UserGetOneById(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String userId) {

        var user = userRepository.findById(userId);
        
        if ( user== null ) {
            throw new IllegalArgumentException("User not found with ID: " + userId);
        }

        return user;
    }


}
