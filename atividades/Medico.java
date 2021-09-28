package aulas;

public class Medico {
	Integer crm;
	String nome;
	double salario;
	double valorConsulta;
	static int totalMedicos = 0;
	
	public Medico() {
		totalMedicos++;
	};
	
	public Medico(Integer crm, String nome, double salario, double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		totalMedicos++;
	}
	
	public void pagamentoDinheiro() {
		this.salario = this.valorConsulta;
	}
	
	public void pagamentoPlano() {
		this.salario = this.valorConsulta * 0.7;
	}
}
