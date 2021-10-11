package atividades;

public class PessoaFisica extends ImpostoRenda {
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.nome = nome;
		this.rendimentos = rendimentos;
		this.cpf = cpf;
		this.rg = rg;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public double calculoIR() {
		double imposto = this.getRendimentos() * 0.88;
		return imposto;
	}

	@Override
	public String print() {
		return (super.print()+"\nCPF: " + getCpf()+"\nRG: "+getRg());
	}
}
