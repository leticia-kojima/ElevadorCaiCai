package br.com.elevadorCaiCai.modelo;

public class Elevador {
	
	private String nome;
	private int capacidadeMaximaPessoas;
	private int andarMaximo;
	private int andarMinimo;
	private int andarAtual;
	private int qtdePessoas;
	
	
	public String sair() {
		if(qtdePessoas > 0) {
			qtdePessoas-=1;
			return "Qtde pessoas: " + qtdePessoas;
		}
		
		return "Saída de pessoas não pode ser menor que zero";
	}
	
	public String entrar(int qtde) {
		int quantidadeFinal = qtde + qtdePessoas;
		if(quantidadeFinal < capacidadeMaximaPessoas) {
			qtdePessoas+=qtde;
			return "Qtde pessoas: " + qtdePessoas;
		}
		
		return "Capacidade máxima já atingida";
	}
	
	public String entrar() {
		if(qtdePessoas < capacidadeMaximaPessoas) {
			qtdePessoas+=1;
			return "Qtde pessoas: " + qtdePessoas;
		}
		
		return "Capacidade máxima já atingida";
	}
	
	public void descer() {
		if(andarAtual > andarMinimo) {
			andarAtual-=1;
		}
		
	}
	
	public void subir() {
		
		if(andarAtual < andarMaximo) {
			andarAtual+=1;
		}
		
	}
	
	public String toString(){
		
		return 
				"Nome: " + nome +
				" - Capacidade máxima de pessoas: " + capacidadeMaximaPessoas +
				" - Andar Máximo: " + andarMaximo +
				" - Andar Mínimo: " + andarMinimo +
				" - Andar Atual: " + andarAtual +
				" - Quantidade de pessoas: " + qtdePessoas;
		
	}
	
	public void preencherNome(String param) {
		
		nome = param;
		
	}
	
	public void inicializar(int cmp, int andarMax, int andarMin) {
		
		capacidadeMaximaPessoas = cmp;
		andarMaximo = andarMax;
		andarMinimo = andarMin;
		
	}
	

}
