package com.projeto.projeto1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projeto1.model.User;

public interface IUserRepository extends JpaRepository<User,Integer>{

}
