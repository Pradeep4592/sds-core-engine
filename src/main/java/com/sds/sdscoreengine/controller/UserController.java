package com.sds.sdscoreengine.controller;

import com.sds.sdscoreengine.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/create")
    public  User createUser(){
    return null;
  };
    @DeleteMapping("/delete")
    public void deleteUser(){

    }
    @PutMapping
    public User updateUser(){
        return null;
    }
    @GetMapping("/getById")
    public User getUserById(String userId){
        return new User();
    }

    @GetMapping("/getAll")
    public List<User> getAllUser(String userId){
        return new ArrayList<User>();
    }

}
