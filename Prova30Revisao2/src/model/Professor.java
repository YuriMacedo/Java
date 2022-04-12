package model;

public class Professor extends Funcionario {
	private int horasTrabalhadas;
	private double valorHora;

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public Professor(int matricula, String nome, double salarioBase, double descontos, int horasTrabalhadas,
			double valorHora) {
		super(matricula, nome, salarioBase, descontos);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public Professor() {
		super();
	}
	
	public double calcularSalario() {
		return 
		super.getSalarioBase()+valorHora*
		horasTrabalhadas-super.getDescontos();
	}

}
