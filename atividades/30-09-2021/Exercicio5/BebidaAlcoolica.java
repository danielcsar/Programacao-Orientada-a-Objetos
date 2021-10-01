package exercicio5;

public class BebidaAlcoolica extends Produto {
	private double teorAlcoolico;

	public BebidaAlcoolica(String nome, double valor, double teorAlcoolico) {
		super(nome, valor);
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	@Override
	public double vender(int qtdeItens) {
		double total = qtdeItens * super.getValor();
		return total;
	}

	public void valorTotal(int qtde) {
		System.out.printf("Valor total %s: %.2f\n", this.getNome(), this.vender(qtde));
	}

	@Override
	public String toString() {
		return (super.toString()+"\nTeor Alcoolico: "+this.getTeorAlcoolico()+"%");
	}
		

}
