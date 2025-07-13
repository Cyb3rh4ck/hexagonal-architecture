package com.codigojava.insurance.insurance360.user.application.userdelete;

import com.codigojava.insurance.insurance360.user.domain.UserRepository;

public class UserDelete {
    
    private UserRepository userRepository;

    public UserDelete(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(String userId) {
        var user = userRepository.findById(userId);
        
        if (user == null) {
            throw new IllegalArgumentException("User not found with ID: " + userId);
        }

        userRepository.delete(userId);
    }

}
