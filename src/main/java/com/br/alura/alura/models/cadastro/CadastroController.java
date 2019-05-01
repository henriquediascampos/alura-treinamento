package com.br.alura.alura.models.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CadastroController {

	@Autowired
	private CadastroDao cadastroDao;
	
	protected CadastroController() {

	}
		
	public void cadastro() {
		// result.include("variable", "cadastro!");
	}
	
	// @Get("/cadastro/busca")
	public void busca() {
		// List<Cadastro> cadastro = cadastroDao.lista();
		// result.use(Results.json()).from(cadastro).recursive().serialize();
	}
	
	// @Get("/cadastro/buscaId")
	public void buscaId(Long id) {
		// Cadastro cadastro = cadastroDao.buscarPorId(id);
		// result.use(Results.json()).from(cadastro).recursive().serialize();
	}
	
	// @Get("/cadastro/salvar")
	public void salvar(String nome) {
		// Cadastro cadastro = new Cadastro();
		// cadastro.setNome(nome);
		// cadastroDao.salvar(cadastro);
		// result.include("variable", "cadastro!");
		// result.use(Results.json()).from(cadastro).recursive().serialize();
	}
	
	// @Get("/cadastro/bucarNome")
	// public void buscarNome(String nome) {
	// 	Cadastro cadastro = cadastroDao.buscarPorNome(nome);
	// 	result.use(Results.json()).from(cadastro).serialize();
	// }
}
