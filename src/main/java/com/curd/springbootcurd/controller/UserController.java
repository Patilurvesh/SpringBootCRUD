package com.curd.springbootcurd.controller;


import com.curd.springbootcurd.module.User;
import com.curd.springbootcurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    @PostMapping("/addUser")
    public ResponseEntity<String> addUser (@RequestBody User user) {
        userService.addUser(user);

        return ResponseEntity.status(201).body("USer added Successfully");
    }

    @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable String id ,@RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }

public void gitDemo(){
    System.out.println("second change ");
}



}
