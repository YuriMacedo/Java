package controller;

import model.Funcionario;
import model.Professor;
import util.Teclado;

public class Cadastro {
public static void main(String[] args) {
	Funcionario f1 = new Funcionario();
	
	f1.setMatricula(Teclado.lerInt
			("Digite sua matr�cula"));
	f1.setNome(Teclado.lerTexto("Digite seu nome"));
	f1.setSalarioBase(Teclado.lerDouble
			("Digite seu sal�rio base"));
	f1.setDescontos(Teclado.lerDouble
			("Digite os descontos"));
	System.out.println("Nome: "+f1.getNome()+
		" Sal�rio l�quido: "+f1.calcularSalario());
	
	Professor p1 = new Professor();
	p1.setMatricula(Teclado.lerInt
			("Digite sua matr�cula"));
	p1.setNome(Teclado.lerTexto("Digite seu nome"));
	p1.setSalarioBase(Teclado.lerDouble
			("Digite seu sal�rio base"));
	p1.setDescontos(Teclado.lerDouble
			("Digite os descontos"));
	p1.setHorasTrabalhadas(Teclado.lerInt
			("Digite as horas trabalhadas no m�s"));
	p1.setValorHora(Teclado.lerDouble
			("Digite o valor da hora"));
	
	System.out.println("Nome: "+p1.getNome()+
			" Sal�rio l�quido: "+p1.calcularSalario());
}
}
