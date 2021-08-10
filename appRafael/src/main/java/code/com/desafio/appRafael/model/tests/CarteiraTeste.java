package code.com.desafio.appRafael.model.tests;

import code.com.desafio.appRafael.model.domain.Carteira;

public class CarteiraTeste {
	public static void main(String[] args) {
		Carteira carteira = new Carteira("Inter");
		
		carteira.setSaldo(245.89f);
		
		System.out.println(carteira);
	}
}
