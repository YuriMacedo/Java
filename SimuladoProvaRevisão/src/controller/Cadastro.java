package controller;

import model.ProdutoEncomenda;
import model.ProdutoImportado;
import model.ProdutoNacional;

public class Cadastro {

	public static void main(String[] args) {
		ProdutoNacional pn1 = new ProdutoNacional();
		ProdutoImportado pi1 = new ProdutoImportado();
		ProdutoEncomenda pe1 = new ProdutoEncomenda();
		
		pn1.setCodigo(1);
		pn1.setNome("Computador Positivo");
		pn1.setDescricao("PC extremamente ruim,mas é nacional.");
		pn1.setPrecoCompra(1000);
		
		System.out.println("Produto: "+pn1.getNome()+"\nValor: "+pn1.calcularValorVenda());
		
		System.out.println("-----------------------------");
		
		pe1.setCodigo(2);
		pe1.setDataPedido("12/04/2020");
		pe1.setNome("Camera Fotográfica Kanon");
		pe1.setDescricao("Camera de última geração 3zilhões de pixels");
		pe1.setPrecoCompra(2000);
		
		System.out.println("Produto: "+pe1.getNome()+"\nValor: "+pe1.calcularValorVenda());
		
		System.out.println("-----------------------------");
		
		pi1.setCodigo(3);
		pi1.setNome("Playstation 5");
		pi1.setDescricao("Novo console da Sony");
		pi1.setPaisOrigem("EUA");
		pi1.setPrecoCompra(3000);
		pi1.setValorDolar(4.50);
		
		System.out.println("Produto: "+pi1.getNome()+"\nValor: "+pi1.calcularValorVenda());

	}

}
