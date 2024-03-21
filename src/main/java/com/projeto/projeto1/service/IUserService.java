package com.projeto.projeto1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.projeto1.model.User;


@Service
public interface IUserService {

    public List<User> getUserList();

}
