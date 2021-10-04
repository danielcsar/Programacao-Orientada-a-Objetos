package exercicio5;

public abstract class Produto implements Venda {
	private String nome;
	private double valor;
	private double total;
	private int qtde;

	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtdeItens) {
		this.qtde = qtdeItens;
	}
	
	@Override
	public double vender(int qtdeItens) {
		double venda = qtdeItens * this.valor;
		this.setQtde(qtdeItens);
		total = venda;		
		return total;
	}
	
	@Override
	public String toString() {
		return ("\nProduto: "+this.getNome()+
				"\nValor: "+this.getValor()+
				"\nQuantidade: "+this.getQtde()+
				"\nValor total produto: "+this.getTotal());
	}


}
