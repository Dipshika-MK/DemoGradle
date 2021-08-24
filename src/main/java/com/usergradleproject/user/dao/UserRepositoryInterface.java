
package com.usergradleproject.user.dao;

import com.usergradleproject.user.dto.*;



public interface  UserRepositoryInterface {
    User getUser(String email, String password);
    User updateUser(int id, User user);
 /*   void deleteUser(int id);
    User saveUser(User user);*/

    }


