package com.usergradleproject.service;

import com.usergradleproject.exception.UserNotFoundException;
import com.usergradleproject.user.dao.UserRepositoryInterface;

import com.usergradleproject.user.dto.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
    public class UserServiceImpl implements UserInterface {
       private UserRepositoryInterface userRepositoryInterface;

    public void setUserRepositoryInterface(UserRepositoryInterface userRepositoryInterface) {
        this.userRepositoryInterface = userRepositoryInterface;
    }


        @Override
        @Transactional
        public User getUser(String email, String password) {
            return this.userRepositoryInterface.getUser(email, password);
        }

        @Override
        @Transactional
        public User updateUser(int id, User user) {
            return this.userRepositoryInterface.updateUser(id,user);
        }
/*
        @Override
        public void deleteUser(int id) {
            repository.findById(id).orElseThrow(UserNotFoundException::new);
            repository.deleteById(id);
        }

        @Override
        public User saveUser(User user) {
            repository.save(user);
            return user;
        }*/
    }
