package com.exercicio2.exercicio2lista11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping ("/login")
public class Exercicio2Lista11Application {

	@GetMapping("/{user}")
	public Boolean ehAdmin (@PathVariable String user){
		if (user.equals("admin")){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Lista11Application.class, args);
	}

}
