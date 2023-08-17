package dev.dulred.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dulred.demo.entity.User;
import dev.dulred.demo.mapper.UserMapper;
import dev.dulred.demo.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
// @RequiredArgsConstructor
public class TestController {

    @Autowired
    private  UserMapper userMapper;



    @GetMapping("/about/")
    public User test(){
        System.out.println("wolailanishima");
        return userMapper.selectOne(1);
    }




}
