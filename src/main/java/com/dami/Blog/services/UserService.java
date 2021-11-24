package com.dami.Blog.services;

import com.dami.Blog.models.User;

public interface UserService {
    User register(User user);
    int sizeOfUsers();
    void deleteUserById(int id);
    User findUser(int id);
}
