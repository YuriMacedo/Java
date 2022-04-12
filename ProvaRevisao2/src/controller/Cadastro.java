package controller;



import model.Funcionario;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "Ygor", 2000, 500);
		Professor p1 = new Professor(2, "Yuri", 2000, 500, 8, 60);
		
		System.out.println("Nome: "+f1.getNome()+"\nSalário líquido: "+f1.calcularSalario()+" R$");
		System.out.println("Nome: "+p1.getNome()+"\nSalário líquido: "+p1.calcularSalario()+" R$");

	}

}
