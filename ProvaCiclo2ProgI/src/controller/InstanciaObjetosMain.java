package controller;

public class InstanciaObjetosMain {

	public static void main(String[] args) {
		
		System.out.println("Pessoa:");
		Pessoa p1 = new Pessoa("Fernando", "Macedo", 123213123);
		
		System.out.println("Nome: "+p1.getNomeCompleto());
		System.out.println("CPF:"+p1.getCpf());
		
		System.out.println("Funcionario:");
		Funcionario f1 = new Funcionario("Yuri", "Macedo", 222222222, 53, 1000, "TI");
		System.out.println("Nome: "+f1.getNomeCompleto());
		System.out.println("CPF: "+f1.getCpf());
		System.out.println("Salario: "+f1.getSalario());
		System.out.println("1º parcela: "+f1.getPrimeiraParcela(f1.getSalario()));
		System.out.println("2º parcela: "+f1.getSegundaParcela(f1.getSalario()));
		System.out.println("Aumento da primeira Parcela: "+f1.aumentoPrimeiraParcela(f1.getSalario()));
		System.out.println("Departamento de "+f1.getDepartamento());
		
		System.out.println("Professor:");
		Professor prof1 = new Professor("Dayane", "Lopes", 234234234, 23, 2000,"Aulas");
		System.out.println("Nome: "+prof1.getNomeCompleto());
		System.out.println("CPF: "+prof1.getCpf());
		System.out.println("Salario: "+prof1.getSalario());
		System.out.println("Dapartamento :"+prof1.getDepartamento());
		
		
		

	}

}
