package exercicio1;

public class ControlePagamento {
	private double total;	

	public double getTotal() {
		return total;
	}
	
	public void calculaTotalPago(Plano plano) {		
		total += plano.calcularPagamento();
	}
}
