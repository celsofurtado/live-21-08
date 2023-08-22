package br.com.fiap.on;

import br.com.fiap.on.model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.nome = "Maria da Silva";
		c1.email = "maria@uol.com.br";
		c1.idade = 26;
		c1.peso = 76;
		c1.altura = 1.72;
		c1.exibirDados();
		
		Cliente c2 = new Cliente();
		c2.nome = "João Pedro";
		c2.email = "joao@terra.com.br";
		c2.idade = 35;
		c2.peso = 87;
		c2.altura = 1.81;
		c2.exibirDados();
		
		System.out.println(new Cliente());
		
	}

}
