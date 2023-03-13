package com.element.user;

import jakarta.inject.Singleton;

@Singleton
public class UserService {

    public User getUserById(String id) {
        return new User("Hello User " + id);
    }
}
