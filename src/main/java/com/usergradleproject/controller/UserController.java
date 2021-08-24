/*
package com.fullintel.controller;

import com.fullintel.user.Test;

import com.fullintel.user.dao.UserDaoImpl;
import com.fullintel.user.dao.UserDaoInterface;
import com.fullintel.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDaoInterface userDao;


    @GetMapping("/api/v1/{email}/{password}")
    public ResponseEntity<?> getInfo(@PathVariable String email, @PathVariable String password) throws Exception {
        List<User> test = userDao.getUser(email, password);
        //user.setEmail("admin@capestart.com");
        return ResponseEntity.ok(test);

        //String test = userDao.insertUser(user);
        // return ResponseEntity.ok(test);
    }
    */
/*@GetMapping("/api/v1")
    public ResponseEntity<?> getInfo(@RequestParam String email, @RequestParam  String password) throws Exception {
        List<User> test = userDao.getUser(email, password);
        //user.setEmail("admin@capestart.com");
        return ResponseEntity.ok(test);

        //String test = userDao.insertUser(user);
        // return ResponseEntity.ok(test); // url:http://localhost:8080/fullintel/api/v1/test/email=admin@capestart.com & password=b85e2529d52e65a03acba2d8591b712c
    }
    *//*

    @PostMapping(value = "/api/v1")
    public ResponseEntity<?> postInfo(@RequestBody User user)
    {
        return ResponseEntity.ok(userDao);
    }

    @PutMapping(value = "/api/v1")
    public ResponseEntity<?> putInfo(@RequestBody User user)
    {
        System.out.println("Hi ");
        userDao.updateUser(user.getId(), user.getFirstName(), user.getLastName());
        return ResponseEntity.ok(userDao);

    }

    */
/*@DeleteMapping(value = "/api/v1")
    public ResponseEntity<?> deleteInfo(@RequestBody User user)
    {
        return ResponseEntity.ok(userDao);
    }*//*


    @DeleteMapping("/api/v1/{id}")
    public ResponseEntity<?> deleteInfo(@PathVariable Integer id) throws Exception {

        userDao.deleteUser(id);
        return ResponseEntity.ok("Deleted");

    }
}
*/
