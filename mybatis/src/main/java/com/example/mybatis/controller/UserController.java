package com.example.mybatis.controller;

import com.example.mybatis.entity.User;
import com.example.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public List<User> getAll() {
        return userMapper.findAll();
    }
}
