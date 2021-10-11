package atividades;

public class MainEmpregado {

	public static void main(String[] args) {
		Empregado emp1 = new Empregado("Daniel", "Cesar", 8700.00);
		Empregado emp2 = new Empregado("Rafael", "Alves", 4500.00);
		
		emp1.salarioLiquido();
		emp2.salarioLiquido();
		
		emp1.imprimirEmpregado();
		emp2.imprimirEmpregado();
	}
}
