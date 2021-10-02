package aula7;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado += TipoServico.Lavar.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		valorCobrado += TipoServico.TrocaOleo.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double revisao() {
		valorCobrado += TipoServico.Revisao.getValorPorServico();
		return valorCobrado;
	}
}
