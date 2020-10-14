package com.example.Clinica.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controler {

	@RequestMapping("/")
	public String inicio() {
		return "pag1";
	}
	
	@RequestMapping("/pagina2")
	public String pg2() {
		return "pag2";
	}
	
	@RequestMapping("/pagina3")
	public String pg3() {
		return "conteudo2";
	}
	
	@RequestMapping("/pagina4")
	public String pg4() {
		return "conteudo";
	}

}
