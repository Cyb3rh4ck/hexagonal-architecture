package com.codigojava.insurance.insurance360.user.application.useredit;

import com.codigojava.insurance.insurance360.user.domain.User;
import com.codigojava.insurance.insurance360.user.domain.UserEmail;
import com.codigojava.insurance.insurance360.user.domain.UserName;
import com.codigojava.insurance.insurance360.user.domain.UserRepository;

public class UserEdit {
    
    private UserRepository userRepository;

    public UserEdit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(String userId, String name, String email) {
        // Fetch the user by userId
        User user = userRepository.findById(userId);
        
        if (user != null) {
            // Update the user's name and email by creating a new User instance
            User updatedUser = new User(
                user.getId(),
                new UserName(name),
                new UserEmail(email),
                user.getCreateAt()  // Keep the original creation timestamp
            );
            
            // Save the updated user back to the repository
            userRepository.save(updatedUser);
        } else {
            throw new IllegalArgumentException("User not found with id: " + userId);
        }
    }

}
