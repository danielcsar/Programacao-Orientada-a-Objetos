package aula7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		super.valorCobrado += TipoServico.LAVAR.getValorPorServico();
		return super.valorCobrado;
	}

	@Override
	public double trocarOleo() {
		if (this.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			super.valorCobrado += TipoServico.TROCAOLEO.getValorPorServico() - 50;
			return super.valorCobrado;
		} else {
			return super.valorCobrado;
		}

	}

	@Override
	public double revisao() {
		if (this.dataConserto.getMonth().equals(Month.AUGUST)) {
			super.valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.9;
			return super.valorCobrado;
		} else {
			return super.valorCobrado;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "\nCategoria: " + this.getCategoria());
	}
}
