package exercicio1;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public String toString() {
		return (super.toString()+"Tipo: "+this.getTipoAnestesia()+"\n");
	}
	
	@Override
	public double calcularPagamento() {		
		return (super.calcularPagamento() + 1000);
	}
}
