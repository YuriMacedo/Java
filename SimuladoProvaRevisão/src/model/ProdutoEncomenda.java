package model;

public class ProdutoEncomenda extends ProdutoNacional{
	
	private String dataPedido;

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public ProdutoEncomenda(int codigo, String nome, String descricao, double precoCompra, double precoVenda,
			String dataPedido) {
		super(codigo, nome, descricao, precoCompra, precoVenda);
		this.dataPedido = dataPedido;
	}

	public ProdutoEncomenda() {
		super();
	}
	
	public double calcularValorVenda() {
		
		super.setPrecoVenda(super.getPrecoCompra() * 1.40 + calcularIcms());
		return super.getPrecoVenda();
	}

}
