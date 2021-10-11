package atividades;

public class MainFuncionario {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Daniel", 10000);
		Funcionario assistente = new Assistente("Gilnei", 1.5, 0.5);

		gerente.calcularParticipacao();
		assistente.calcularParticipacao();
		
		System.out.println(gerente.toString());
		System.out.println(assistente.toString());
	}

}
