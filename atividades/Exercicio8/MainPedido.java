package atividades;

import java.time.LocalDate;

public class MainPedido {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(1, LocalDate.of(2021, 10, 03), 2, 50.00);
		Pedido pedido2 = new Pedido(2, LocalDate.of(2021, 9, 29), 1, 10.00);
		Pedido pedido3 = new Pedido(3, LocalDate.now(), 20, 10.00);
              	
		pedido1.finalizarPedido();
		pedido2.finalizarPedido();
		pedido3.finalizarPedido();
		
		Pedido total = new Pedido();
		total.imprimirTotalPedido();		
	}
}