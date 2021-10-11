package atividades;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public double calcularParticipacao() {
		double adc = super.calcularParticipacao() + 200;
		return adc;
	}
}
