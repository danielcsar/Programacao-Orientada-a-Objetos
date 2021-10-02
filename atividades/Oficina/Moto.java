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
		super.valorCobrado += TipoServico.LAVAR.getValorPorServico();
		return super.valorCobrado;
	}

	@Override
	public double trocarOleo() {
		super.valorCobrado += TipoServico.TROCAOLEO.getValorPorServico();
		return super.valorCobrado;
	}

	@Override
	public double revisao() {
		super.valorCobrado += TipoServico.REVISAO.getValorPorServico();
		return super.valorCobrado;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nCilindradas: " + this.getCilindradas());
	}
}
