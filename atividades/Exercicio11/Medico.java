package exercicio1;

public class Medico extends Plano {
	protected String nome;
	private int crm;
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	}
	
	@Override
	public String toString() {
		return (super.toString()+"\nMédico: "+this.getNome()+"\nCRM: "+this.getCrm()+"\n");
	}
	
	@Override
	public double calcularPagamento() {
		double valor = super.calcularPagamento() * 1.10;
		return valor;
	}		
}
