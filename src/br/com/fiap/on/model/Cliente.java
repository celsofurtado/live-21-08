package br.com.fiap.on.model;

public class Cliente {
	
	public String nome;
	public String email;
	public int idade;
	public int peso;
	public double altura;
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("IMC: " + String.format("%.2f", calcularImc())); 
		System.out.println("---------------------");
	}
	
	private double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}

}
