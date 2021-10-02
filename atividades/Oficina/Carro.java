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
		valorCobrado += TipoServico.Lavar.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		if (this.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorCobrado += TipoServico.TrocaOleo.getValorPorServico() - 50;
			return valorCobrado;
		} else {
			return valorCobrado;
		}

	}

	@Override
	public double revisao() {
		if (this.dataConserto.getMonth().equals(Month.AUGUST)) {
			valorCobrado += TipoServico.Revisao.getValorPorServico() * 0.9;
			return valorCobrado;
		} else {
			return valorCobrado;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "\nCategoria: " + this.categoria + "\nValor Total: " + this.getValorCobrado());
	}
}
