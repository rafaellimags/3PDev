package code.com.desafio.appRafael.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import code.com.desafio.appRafael.model.domain.Carteira;

@Controller
public class CarteiraController {
	@GetMapping(value = "/")
	public String inicializa() {
		return "index";
	}
	
	@GetMapping(value = "/carteira")
	public String telaCadastro() {
		return "carteira/cadastro";
	}
	
	@GetMapping(value = "/carteira/excluir")
	public String excluir(Model model) {
		model.addAttribute("mensagem", "Carteira excluída com sucesso!");
		return obterLista(model);
		// return "carteira/lista";
		// return "redirect:/carteira/lista";
		// redirect nao leva as informações do model pra outra tela
	}
	
	@PostMapping(value = "/carteira/incluir")
	public String incluir(Model model, Carteira carteira) {
		model.addAttribute("mensagem", "A carteira "+ carteira.getNome() +" cadastrada com sucesso!");
		return obterLista(model);
	}
	
	@GetMapping(value = "/carteira/consultar")
	public String consultar() {
		return "";
	}
	
	@GetMapping(value = "/carteira/lista")
	public String obterLista(Model model) {
		List<Carteira> colecaoCarteiras = new ArrayList<Carteira>();
		
		colecaoCarteiras.add(new Carteira("Emergências"));
		colecaoCarteiras.add(new Carteira("Viagens"));
		colecaoCarteiras.add(new Carteira("Despesas Mensais"));
		
		model.addAttribute("carteiras", colecaoCarteiras);
		
		return "carteira/lista";
	}
}
