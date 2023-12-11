package com.colegio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColegioController {
	
	@GetMapping("/login")
	public String openLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String testLogin(
		@RequestParam(name="txtCorreo") String email,
		@RequestParam(name="txtPassword") String clave,
		Model model){
		//verificar el correo y contraseña
		if (email.equals("eduardopacompialopez@gmail.com") && clave.equals("123456")) {
			model.addAttribute("mensaje", "Bienvenido" + email);
			model.addAttribute("cssmensaje", "alert alert-success");
		}else {
			model.addAttribute("mensaje", "Error de inicio de sesion");
			model.addAttribute("cssmensaje", "alert alert-danger");
		}
		return "login";
	}
	
	
}
