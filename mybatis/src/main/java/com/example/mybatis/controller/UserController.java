package com.example.mybatis.controller;

import com.example.mybatis.entity.User;
import com.example.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("")
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @GetMapping("/add")
    public List<User> addOne() {
        User user = new User();
        user.setName("Jack");
        user.setEmail("ja@ck.com");
        userMapper.addOne(user);
        return userMapper.findAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable int id) {
        return userMapper.findOne(id);
    }

    @GetMapping("/update/{id}")
    public List<User> updateOne(@PathVariable int id) {
        User user = new User();
        user.setName("Steve");
        user.setEmail("steve@mail.com");
        user.setId(id);
        userMapper.updateOne(user);
        return userMapper.findAll();
    }

    @GetMapping("/delete/{id}")
    public List<User> deleteUser(@PathVariable int id) {
        userMapper.deleteUser(id);
        return userMapper.findAll();
    }
}
