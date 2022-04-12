package model;

public class Professor extends Funcionario{
	
	private int hrsTrabalhadas;
	private double valorHr;
	public int getHrsTrabalhadas() {
		return hrsTrabalhadas;
	}
	public void setHrsTrabalhadas(int hrsTrabalhadas) {
		this.hrsTrabalhadas = hrsTrabalhadas;
	}
	public double getValorHr() {
		return valorHr;
	}
	public void setValorHr(double valorHr) {
		this.valorHr = valorHr;
	}
	public Professor(int matricula, String nome, double salarioBase, double descontos, int hrsTrabalhadas,
			double valorHr) {
		super(matricula, nome, salarioBase, descontos);
		this.hrsTrabalhadas = hrsTrabalhadas;
		this.valorHr = valorHr;
	}
	public Professor() {
		super();
	}
	
	public double calcularSalario() {
		
		return super.getSalarioBase() + hrsTrabalhadas * valorHr - super.getDescontos();
	}

}
