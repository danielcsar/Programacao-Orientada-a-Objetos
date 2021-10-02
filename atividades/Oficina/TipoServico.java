package aula7;

public enum TipoServico {
	TrocaOleo(100), Lavar(50), Revisao(200);

	private double valorPorServico;

	TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}
}
