package aula7;

import java.time.LocalDate;

public class TestaOficina {

	public static void main(String[] args) {
		
		Proprietario p = new Proprietario("Daniel");
		
		Carro jaguar = new Carro("Jaguar XJ", LocalDate.of(2021,8, 29), p, "Sedan");
		
		jaguar.revisao();
		jaguar.trocarOleo();
		
		System.out.println(jaguar.toString());
	}

}
