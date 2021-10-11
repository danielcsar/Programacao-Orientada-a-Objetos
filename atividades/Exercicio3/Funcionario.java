package aula;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;	
	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public double abonoSalarial(double abono) {
		return this.salario += abono;
	}
	
	public String toString() {
		return ("Nome: "+this.nome+" Cargo: "+this.cargo+" Salario: "+this.salario);
	}
}
