package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.PessoaDAO;
import models.Pessoa;

@Controller
public class PessoaController {

	
	
	@RequestMapping("/pessoa/formPessoa")
	public String form() {
		System.out.println("chamou o form de pessoa");
	return "pessoa/formPessoa";
}

//
	@PostMapping("/pessoa")
	public String adicionar(Pessoa pessoa)
	{
		PessoaDAO pdao =  new PessoaDAO();
		pdao.inserir(pessoa);
		System.out.println("adicionou o cara ");
		return "redirect:pessoa";
	}
	
	
	
	
}
