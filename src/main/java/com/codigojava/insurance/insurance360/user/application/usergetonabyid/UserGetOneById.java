package com.codigojava.insurance.insurance360.user.application.usergetonabyid;

import com.codigojava.insurance.insurance360.user.domain.User;
import com.codigojava.insurance.insurance360.user.domain.UserId;
import com.codigojava.insurance.insurance360.user.domain.UserRepository;

public class UserGetOneById {
    private UserRepository userRepository;

    public UserGetOneById(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String userId) {
        return userRepository.findById(new UserId(userId));
    }

}
