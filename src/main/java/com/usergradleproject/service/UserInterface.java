package com.usergradleproject.service;


import com.usergradleproject.user.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface {

    User getUser(String email, String password);
    User updateUser(int id, User user);

    /*void deleteUser(int id);
    User saveUser(User user);*/
}