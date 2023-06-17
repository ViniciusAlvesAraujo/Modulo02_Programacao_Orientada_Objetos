package com.programandolista.exercicio1lista11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/elevar-ao-quadrado")

public class Exercicio1Lista11Application {

	@GetMapping("/{numero}")
	public int retornaAoQuadrado(@PathVariable int numero){
		return numero * numero;
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Lista11Application.class, args);
	}

}
