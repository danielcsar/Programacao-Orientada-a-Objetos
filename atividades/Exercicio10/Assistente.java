package atividades;

public class Assistente extends Funcionario {
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.nome = nome;
		this.salario = salario;
		this.adicional = adicional;
	}
	
	@Override
	public double calcularParticipacao() {
		double adc = super.calcularParticipacao() + this.adicional;
		return adc;
	}
}
