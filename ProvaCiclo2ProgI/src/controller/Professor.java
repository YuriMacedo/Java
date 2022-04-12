package controller;

public class Professor extends Funcionario{

	public Professor() {
		super();
		
	}

	public Professor(String nome, String sobrenome, int cpf, int matricula, double salario, String departamento) {
		super(nome, sobrenome, cpf, matricula, salario, departamento);
		
	}
	
	
	public double getSalarioPrimeiraParcela(double salario) {
		
		System.out.println("Não é possível parcelar salário de professor!");
		
		return this.salario;
	}
	
	public double getSalarioSegundaParcela(double salario) {
		
		return this.salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	

}
