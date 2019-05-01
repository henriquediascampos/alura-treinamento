package com.br.alura.alura.models.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@Autowired
	private LoginDao loginDao;
	
	
	// @Path("/login.jsp")
	public void login() {
		
	}
	
	// @Get("/login/fazerLogin/")
	public void fazerLogin() {

	}
	
	// @Get("/login/buscaId")
	public void buscaId(Long id) {
		
	}
	
	// @Get("/login/salvar")
	public void salvar(String nome) {

	}
	
	// @Get("/login/bucarNome")
	public void buscarNome(String nome) {
	
	}
}
