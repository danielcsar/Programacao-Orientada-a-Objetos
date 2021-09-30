package atividades;

public class Empregado {
	private String nome;
    private String sobrenome;
    private double salario;
    private double salLiquido;
    
    public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
    
	public double getSalLiquido() {
		return salLiquido;
	}

	public void setSalLiquido(double salLiquido) {
		this.salLiquido = salLiquido;
	}

	public double calculaImpostoRenda (double valor) {
       
		if(valor < 1903.98) {
		
        }else if(valor >= 1903.98 && valor < 2826.65) {
            valor = valor * 0.075;
        }else if(valor >= 2826.65 && valor < 3751.05) {
            valor = valor * 0.15;
        }else if (valor >= 3751.05 && valor < 4664.68) {
            valor = valor * 0.225;
        }else if (valor > 4664.68) {
            valor = valor * 0.275;
        }
        return valor;
	}	
	
	public void salarioLiquido() {
		double newsalario = this.salario - this.calculaImpostoRenda(this.salario);
		setSalLiquido(newsalario);
	}
	
	public void imprimirEmpregado() {
        System.out.printf("\nEmpregado:%s %s", getNome(), getSobrenome());
        System.out.printf("\nSalario Bruto:R$%.2f", getSalario());
        System.out.printf("\nSalario descontado:R$%.2f\n", getSalLiquido());
        }
}