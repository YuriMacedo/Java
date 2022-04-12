package model;

public class ProdutoPerecivel extends Produto{
	private int diasVencimento;

	public int getDiasVencimento() {
		return diasVencimento;
	}

	public void setDiasVencimento(int diasVencimento) {
		this.diasVencimento = diasVencimento;
	}

	public ProdutoPerecivel(int codigo, String nome, int quantidade, double valor, int diasVencimento) {
		super(codigo, nome, quantidade, valor);
		this.diasVencimento = diasVencimento;
	}

	public ProdutoPerecivel() {
		super();
	}
	
	public double calcularDesconto() {
		
		if((diasVencimento <= 10) && (diasVencimento > 5)){
			super.setValor(super.calcularDesconto() * 0.9);
		}else {
			if(diasVencimento <=5) {
				
				super.setValor(super.calcularDesconto() * 0.75);
			}
		}//fim do else
		
		return super.getValor();

	 
	}

}
