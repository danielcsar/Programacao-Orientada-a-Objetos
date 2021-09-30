package atividades;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public double calcularParticipacao() {
		double adc = salario * 1.01;
		return adc;
	}
	
	public String toString() {
		return ("\nNome: " + this.nome+
				"\nSalário: " + this.calcularParticipacao());				 
	}
}
