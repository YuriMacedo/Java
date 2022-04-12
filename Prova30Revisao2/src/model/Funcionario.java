package model;

public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBase;
	private double descontos;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public Funcionario(int matricula, String nome, double salarioBase, double descontos) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.descontos = descontos;
	}

	public Funcionario() {
		super();
	}

	public double calcularSalario() {
		return salarioBase - descontos;
	}
}
