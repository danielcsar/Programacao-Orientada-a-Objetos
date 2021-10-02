package aula7;

public enum TipoServico {
	TROCAOLEO(100), LAVAR(50), REVISAO(200);

	private double valorPorServico;

	TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}
}
