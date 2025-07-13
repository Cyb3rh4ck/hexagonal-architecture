package com.codigojava.insurance.insurance360.user.domain;

import java.util.List;

public interface UserRepository {

    UserId nextIdentity();

    void save(User user);

    User findById(UserId userId);

    void delete(UserId userId);

    List<User> findAll(); 
}
