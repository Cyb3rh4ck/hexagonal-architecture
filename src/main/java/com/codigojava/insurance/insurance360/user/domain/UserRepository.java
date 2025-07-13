package com.codigojava.insurance.insurance360.user.domain;

import java.util.List;

public interface UserRepository {

    UserId nextIdentity();

    void save(User user);

    User findById(String userId);

    void delete(String userId);

    List<User> findAll(); 
}
