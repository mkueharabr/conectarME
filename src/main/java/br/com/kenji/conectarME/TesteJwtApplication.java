package br.com.kenji.conectarME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class TesteJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteJwtApplication.class, args);
	}

}
