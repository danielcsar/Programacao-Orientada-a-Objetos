package atividades;

public class TestaIR {

	public static void main(String[] args) {
		ImpostoRenda pf = new PessoaFisica("Daniel", 5000, "1234", "5678");
		ImpostoRenda pj = new PessoaJuridica("Cesar LTDA", 15000, "9876", "543210");

		System.out.println(pf.print());
		System.out.println(pj.print());
	}
}
