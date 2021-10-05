package aula;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f[] = new Funcionario[] {
				new Funcionario("Daniel", "gerente", 5000),
				new Funcionario("Cesar", "adm", 2500)
		};
	
		for(Funcionario func : f) {
			double abono = 1000;
			func.abonoSalarial(abono);
			System.out.printf("%s Abono: %.2f\n", func, abono);
		}
	}

}
