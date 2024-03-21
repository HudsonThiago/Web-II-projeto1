package com.projeto.projeto1;

import com.projeto.projeto1.model.User;
import com.projeto.projeto1.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringMvcDatajpaAppApplication {

	@Autowired
	IUserRepository userRepository;
	@Bean
	public CommandLineRunner init(){
		return args -> {

			/*
			 * Cadastrando usuários
			 */

			userRepository.save(new User("João","joao@gmail.com","(84) 99999-9999"));
			userRepository.save(new User("Maria","maria@gmail.com","(84) 99999-9999"));
			userRepository.save(new User("José","jose@gmail.com","(84) 99999-9999"));

			System.out.println("Usuários cadastrados");
			List<User> cursos = userRepository.findAll();
			cursos.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcDatajpaAppApplication.class, args);
	}

}