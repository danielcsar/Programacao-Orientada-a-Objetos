package aula7;

import java.time.LocalDate;

public class TestaOficina {

	public static void main(String[] args) {
		
		Proprietario p = new Proprietario("Daniel");
		
		Carro jaguar = new Carro("Jaguar XJ", LocalDate.of(2021,8, 28), p, "Sedan");
		Moto diavel = new Moto("Diavel Dark", LocalDate.now(), p, 1260);
		
		jaguar.revisao();
		jaguar.trocarOleo();
		diavel.lavarVeiculo();
		
		
		System.out.println(jaguar);
		System.out.println(diavel);
	}

}
