package exercicio1;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorISS = 5;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;		
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	@Override
	public String toString() {
		return ("Empresa: "+this.empresa+"\nValor: "+this.calcularPagamento());
	}
	
	public double calcularPagamento() {
		return (this.valorPago - (this.valorPago * (this.valorISS / 100)));
	}
}
