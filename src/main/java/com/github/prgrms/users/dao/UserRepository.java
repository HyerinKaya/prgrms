package com.github.prgrms.users.dao;

import com.github.prgrms.users.domain.Email;
import com.github.prgrms.users.domain.User;

import java.util.Optional;

public interface UserRepository {

    void update(User user);

    Optional<User> findById(long id);

    Optional<User> findByEmail(Email email);

}