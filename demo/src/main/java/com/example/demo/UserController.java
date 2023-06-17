package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo repo ;


@GetMapping("/getUsers")
    public List<User> getUser(){

        return repo.findAll();
        
    }

    @PostMapping("/saveuser")
    public void saveusers(@RequestBody User user){

       repo.save(user);

    }
    
}
