package model;

public class ProdutoImportado extends ProdutoNacional{
	
	private String paisOrigem;
	private double valorDolar;
	private double valorReal;
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public double getValorDolar() {
		return valorDolar;
	}
	public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}
	public double getValorReal() {
		return valorReal;
	}
	public void setValorReal(double valorReal) {
		this.valorReal = valorReal;
	}
	public ProdutoImportado(int codigo, String nome, String descricao, double precoCompra, double precoVenda,
			String paisOrigem, double valorDolar, double valorReal) {
		super(codigo, nome, descricao, precoCompra, precoVenda);
		this.paisOrigem = paisOrigem;
		this.valorDolar = valorDolar;
		this.valorReal = valorReal;
	}
	public ProdutoImportado() {
		super();
	}
	
	public double calcularValorReal() {
		
		valorReal = super.getPrecoCompra() * valorDolar;
		return valorReal;
		
	}
	public double calcularValorVenda(){
		super.setPrecoVenda(calcularValorReal() * 1.80);
		
		return super.getPrecoVenda();
	}

}
