package controller;

public class Funcionario extends Pessoa{
	protected int matricula;
	protected double salario;
	protected String departamento;

	public Funcionario(String nome, String sobrenome, int cpf, int matricula, double salario, String departamento) {
		super(nome, sobrenome, cpf);
		this.matricula = matricula;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	
	

	public Funcionario() {
		super();
	}




	public int getMatricula() {
		return matricula;
	}




	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}




	public double getSalario() {
		return salario;
	}




	public void setSalario(double salario) {
		this.salario = salario;
	}




	public String getDepartamento() {
		return departamento;
	}




	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}




	public double getPrimeiraParcela(double salario) {
		return salario * 0.60;
	}
	
	public double getSegundaParcela(double salario) {
		return salario * 0.40;
	}
	
	public double aumentoPrimeiraParcela(double salario) {
		
		return getPrimeiraParcela(salario) * 0.20;
	}
	
	

}
