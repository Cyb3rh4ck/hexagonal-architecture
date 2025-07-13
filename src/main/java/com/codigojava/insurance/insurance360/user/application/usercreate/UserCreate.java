package com.codigojava.insurance.insurance360.user.application.usercreate;

import java.util.Date;
import java.util.List;

import com.codigojava.insurance.insurance360.user.domain.User;
import com.codigojava.insurance.insurance360.user.domain.UserCreateAt;
import com.codigojava.insurance.insurance360.user.domain.UserEmail;
import com.codigojava.insurance.insurance360.user.domain.UserId;
import com.codigojava.insurance.insurance360.user.domain.UserName;
import com.codigojava.insurance.insurance360.user.domain.UserRepository;



public class UserCreate {

    private UserRepository userRepository;

    public UserCreate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(String userId, String name, String email, Date createAt) {

        User user = new User(new UserId(userId), 
        new UserName(name), new UserEmail(email), new UserCreateAt(createAt));

        userRepository.save(user);
    }


}
