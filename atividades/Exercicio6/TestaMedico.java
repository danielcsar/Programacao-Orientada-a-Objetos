package aulas;

public class TestaMedico {

	public static void main(String[] args) {
		Medico medicoUm = new Medico();
		medicoUm.crm = 12345;
		medicoUm.nome = "Ana Maria";
		medicoUm.salario = 0;
		medicoUm.valorConsulta = 250;

		Medico medicoDois = new Medico(456789, "Antônio", 0, 300);

		medicoUm.pagamentoPlano();

		medicoDois.pagamentoDinheiro();

		System.out.printf("Temos um total de: %d médicos disponíveis.\n", Medico.totalMedicos);
		System.out.println("Medico(a):");
		System.out.println("Nome: " + medicoUm.nome);
		System.out.println("CRM: " + medicoUm.crm);
		System.out.println("Valor da consulta: " + medicoUm.valorConsulta);
		System.out.println("Salário desse mês: " + medicoUm.salario);

		System.out.println("\n");

		System.out.println("Medico(a):");
		System.out.println("Nome: " + medicoDois.nome);
		System.out.println("CRM: " + medicoDois.crm);
		System.out.println("Valor da consulta: " + medicoDois.valorConsulta);
		System.out.println("Salário desse mês: " + medicoDois.salario);
	}
}
