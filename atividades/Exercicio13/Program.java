package exercicio3;

public class Program {

	public static void main(String[] args) {
		Estado e1 = new Estado("Rio de Janeiro", "RJ");
		Estado e2 = new Estado("Paraná", "PR");

		Cidade c1 = new Cidade("Teresópolis", e1);
		Cidade c2 = new Cidade("Curitiba", e2);

		Telefone t1 = new Telefone("2019-2019");
		Telefone t2 = new Telefone("2020-2020");
		Telefone t3 = new Telefone("2021-2021");

		Endereco end1 = new Endereco("Rua 1", "Centro", "1234", c1);
		Endereco end2 = new Endereco("Rua 2", "Água Verde", "4567", c2);

		Contato cont1 = new Contato("Daniel", end1);
		Contato cont2 = new Contato("Cesar", end2);

		cont1.setTelefones(t1);
		cont1.setTelefones(t2);
		cont2.setTelefones(t3);

		System.out.println(cont1);
		//cont1.mostrarTelefones();
		System.out.println("\n" + cont2);
		//cont2.mostrarTelefones();
	}
}
