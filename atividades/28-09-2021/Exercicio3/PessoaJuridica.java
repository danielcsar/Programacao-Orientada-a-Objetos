package atividades;

public class PessoaJuridica extends ImpostoRenda {
	private String cnpj;
	private String inscEstadual;

	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	@Override
	public double calculoIR() {
		double imposto = this.getRendimentos() * 0.85;
		return imposto;
	}

	@Override
	public String print() {
		return (super.print() + "\nCnpj: " + getCnpj() + "\nInscrição Estadual: " + getInscEstadual());
	}
}
