package exercicio5;

public class ControlePagamento {
	private double totalVenda;

	public double getTotalVenda() {
		return totalVenda;
	}
	
	public double calculaTotalPago(Produto produto) {		
		this.totalVenda += produto.getTotal();
		return totalVenda;
	}
	
	public String toString() {
		return ("\nValor total da Venda: "+ this.totalVenda);
	}
}