package atividades;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private int quantidade;
	private LocalDate dataPedido;
	private double valor;
	private double total;	
	public static int totalPedido = 0;

	public Pedido() {
		Pedido.totalPedido += 1;
	}

	public Pedido(int numero, LocalDate dataPedido, int quantidade, double valor) {
		this();
		this.dataPedido = dataPedido;
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public double getTotal() {
		return total;
	}
	
	public double desconto(double valor) {		
		if (this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			valor = this.valor * 0.9;
		} else {
			valor = this.valor;
		}
		return valor;
	}
	
	public double calculoTotal() {
		double total = getQuantidade() * getValor();
		return total;
	}
	
	public void finalizarPedido() {
		double valorDesc = this.desconto(this.getValor());
						
		System.out.printf("\nNumero Pedido: %d\n", getNumero());
		System.out.printf("Quantidade Pedido: %d\n", getQuantidade());
		System.out.printf("Valor Pedido: %.2f\n", getValor());
		System.out.printf("Valor c/ Desconto de Domingo: %.2f\n", valorDesc);
		System.out.printf("Valor Total: %.2f\n", calculoTotal());

	}
	
	public void imprimirTotalPedido() {
		System.out.printf("\nTotal de Pedidos: %d", Pedido.totalPedido);
	}
}