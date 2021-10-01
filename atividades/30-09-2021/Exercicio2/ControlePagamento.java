package exercicio1;

public class ControlePagamento {
	private int total;	

	public int getTotal() {
		return total;
	}
	
	public void calculaTotalPago(Plano plano) {		
		total += plano.calcularPagamento();
	}
}
