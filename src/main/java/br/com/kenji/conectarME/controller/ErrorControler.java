package br.com.kenji.conectarME.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
 class ErrorControler implements ErrorController {
	@RequestMapping("/error")
	public String handleError() {
		return "error";
	}
}
