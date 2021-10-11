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
	public String toString() {
		return (super.toString() + "\nVoltagem: " + this.getVoltagem());
	}
}
