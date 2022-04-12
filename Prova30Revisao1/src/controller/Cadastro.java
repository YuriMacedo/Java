package controller;

import model.Produto;
import model.ProdutoPerecivel;

public class Cadastro {
public static void main(String[] args) {
	Produto p1 = new Produto(1,"Lápis",1000,1.00);
	ProdutoPerecivel pp1 = new ProdutoPerecivel
	(2,"Biscoito",20,3.00,9);
	ProdutoPerecivel pp2 = new ProdutoPerecivel
	(3,"Iogurte",10,9.99,3);
	ProdutoPerecivel pp3 = new ProdutoPerecivel
	(4,"Leite",30,2.99,60);
		
	System.out.println("Valor: "+p1.calcularDesconto());
	System.out.println("Valor: "+pp1.calcularDesconto());
	System.out.println("Valor: "+pp2.calcularDesconto());
	System.out.println("Valor: "+pp3.calcularDesconto());
}
}
