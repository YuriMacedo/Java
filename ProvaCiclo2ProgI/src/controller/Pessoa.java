package controller;

public class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected int cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, String sobrenome, int cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNomeCompleto() {
		return nome+" "+sobrenome;
	}
	
	
}
