package code.com.desafio.appRafael.model.domain;

public class Carteira {
	private String nome;
	private String moeda;
	private float saldo;
	
	public Carteira(String nome) {
		this.nome = nome;
		this.moeda = "BRL";
		this.saldo = 0.00f; 
	}
	
//	@Override
//	public String toString() {
//		return "O saldo da sua carteira é de " + saldo + " " + moeda;
//	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
