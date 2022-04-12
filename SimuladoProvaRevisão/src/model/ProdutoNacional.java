package model;

public class ProdutoNacional {
	
	private int codigo;
	private String nome,descricao;
	private double precoCompra;
	private double precoVenda;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public ProdutoNacional(int codigo, String nome, String descricao, double precoCompra, double precoVenda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}
	public ProdutoNacional() {
		super();
	}
	public double calcularIcms() {
		
		return precoCompra * 0.12;
	}
	
	public double calcularValorVenda() {
		
		return precoCompra * 1.20 + calcularIcms();
	}

}
