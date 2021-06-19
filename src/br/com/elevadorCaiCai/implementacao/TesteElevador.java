package br.com.elevadorCaiCai.implementacao;

import br.com.elevadorCaiCai.modelo.Elevador;

public class TesteElevador {
	
	public static void main(String[] args) {
		
		Elevador objeto = new Elevador();
		
		objeto.inicializar(10, 12, 0);
		
		objeto.preencherNome("Torre X");
		
		System.out.println("Conte�do: " + objeto.toString());
		
		objeto.subir();
		
		objeto.descer();
		
		System.out.println("Entrada elevador: " + objeto.entrar());
		
		System.out.println("Entrada qtde informada: " + objeto.entrar(10));
		
		System.out.println("Sa�da elevador: " + objeto.sair());
		
		System.out.println("Conte�do atualizado: " + objeto.toString());
		
	}

}
