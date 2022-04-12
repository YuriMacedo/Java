package controller;

import model.Produto;
import model.ProdutoPerecivel;

public class Cadastro {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Arroz", 1000, 2.50);
		System.out.println("Produto: "+p1.getNome()+"\nPre�o: "+p1.calcularDesconto());
		
		ProdutoPerecivel pp1 = new ProdutoPerecivel(2, "Biscoito", 4000, 3.00, 4);
		ProdutoPerecivel pp2 = new ProdutoPerecivel(3, "Bolacha", 50, 2.00, 10);
		ProdutoPerecivel pp3 = new ProdutoPerecivel(3,"Ruffles", 49, 10, 60);
		
		System.out.println("Produto: "+pp1.getNome()+"\nPre�o: "+pp1.calcularDesconto());
		System.out.println("Produto: "+pp2.getNome()+"\nPre�o: "+pp2.calcularDesconto());
		System.out.println("Produto: "+pp3.getNome()+"\nPre�o: "+pp3.calcularDesconto());
		

	}

}
