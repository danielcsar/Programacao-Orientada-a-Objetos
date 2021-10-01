package exercicio5;

public class Eletrodomestico extends Produto {

	private int voltagem;

	public Eletrodomestico(String nome, double valor, int voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
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
		return (super.toString() + "\nVoltagem: " + this.getVoltagem());
	}

}
