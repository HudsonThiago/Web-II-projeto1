package com.projeto.projeto1.service;

import java.util.List;

import com.projeto.projeto1.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.projeto1.model.User;


@Component
public class UserService implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
