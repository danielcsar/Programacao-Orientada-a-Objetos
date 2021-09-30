package atividades;

public class ImpostoRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;

	public ImpostoRenda(String nome, double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	public double calculoIR() {
		return 0;
	}
	
	public String print() {
		return ("\nNome: " + this.nome + 
				"\nRendimentos: "+this.rendimentos+
				"\nRedimentos descontados: "+this.calculoIR());	
	}
}
