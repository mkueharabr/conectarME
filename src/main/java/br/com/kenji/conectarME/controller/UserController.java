package br.com.kenji.conectarME.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin("*")

public class UserController {

	@RequestMapping("/users")
	@ResponseBody
	public String getUsers() {
		return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
		                   "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
	}
	

	
	
	@GetMapping("/home")
	public String olaHome() {
		return "Olá tudo bom?";
	}
}
