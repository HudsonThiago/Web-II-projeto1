package com.projeto.projeto1.controller;

import java.util.List;

import com.projeto.projeto1.model.User;
import com.projeto.projeto1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    @Qualifier("userService")
    IUserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> userList(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserList());
    }
}
