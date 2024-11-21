package com.curd.springbootcurd.service;

import com.curd.springbootcurd.module.User;
import com.curd.springbootcurd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        userRepo.findAll().forEach(userList::add);
        return userList;
        //        return (List<User>) userrepo.findAll();
    }

    public void addUser(User user) {
       userRepo.save(user);
    }

    public void updateUser(String id, User user) {
        userRepo.save(user);
    }

    public void deleteUser(long id) {
        userRepo.findById(id);
    }
}
