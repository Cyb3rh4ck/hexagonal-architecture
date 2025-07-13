package com.codigojava.insurance.insurance360.user.infrastucture;


import java.util.List;

import com.codigojava.insurance.insurance360.user.domain.User;
import com.codigojava.insurance.insurance360.user.domain.UserId;
import com.codigojava.insurance.insurance360.user.domain.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OracleUserRepository extends JpaRepository<User, String> {

    @Override
    default User findById(UserId userId) {
        return findById(userId.getValue()).orElse(null);
    }

    @Override
    default List<User> findAll() {
        return findAll();
    }

    @Override
    default void save(User user) {
        save(user);
    }

    @Override
    default void delete(User user) {
        delete(user);
    }


}
