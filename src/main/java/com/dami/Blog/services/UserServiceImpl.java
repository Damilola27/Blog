package com.dami.Blog.services;

import com.dami.Blog.models.User;
import com.dami.Blog.repositories.UserRepository;

 public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl() {
        userRepository = new UserRepository();
    }

    @Override
    public User register(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public int sizeOfUsers(){
        return userRepository.count();
    }

     @Override
     public void deleteUserById(int id) {
        userRepository.deleteUser(id);

     }

     @Override
     public User findUser(int id) {
        return userRepository.findUser(id);

     }


 }
