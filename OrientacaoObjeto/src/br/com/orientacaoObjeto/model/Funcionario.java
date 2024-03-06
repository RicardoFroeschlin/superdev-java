package br.com.orientacaoObjeto.model;

public class Funcionario extends Pessoa {
	
	int matricula;
	String setor;
	
	
	// Construtor vazio 
	public Funcionario() {
		
	}
	
	// IMPLEMENTAR CONSTRUTORES
	// GET AND SET
	
	public int getMatricula() {
		return this.matricula;
	}
	public String getSetor() {
		return this.setor;
	}
	
	
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	// ENVIAR PARA O GIT 

}
