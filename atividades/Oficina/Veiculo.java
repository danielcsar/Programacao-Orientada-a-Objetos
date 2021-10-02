package aula7;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;	
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public double lavarVeiculo() {		
		return 0;
	}

	@Override
	public double trocarOleo() {		
		return 0;
	}

	@Override
	public double revisao() {
		return 0;
	}
	
	@Override
	public String toString() {
		return ("\nProprietario: "+this.proprietario+"\nModelo: "+this.modelo+"\nValor Cobrado: "+this.getValorCobrado());
	}
}
