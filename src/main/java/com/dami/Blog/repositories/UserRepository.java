package com.dami.Blog.repositories;

import com.dami.Blog.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<>();

    public User addUser(User user) {

        users.add(user);

        return user;
    }

    public int count() {

        return users.size();
    }

    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);

    }
    public User findUser(int id){
        for(User user :users){
            if(user.getId() == id){
                return user;
            }
        }
       return null;
    }
}

