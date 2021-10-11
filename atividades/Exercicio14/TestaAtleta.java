package exercicio1;

public class TestaAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Brazil");
		Pais pais2 = new Pais("USA");

		Atleta a1 = new Atleta("Joãozin",90.500,"", pais1);
		Atleta a2 = new Atleta("Pedrin",75.840,"", pais1);
		Atleta a3 = new Atleta("Junin",50.100,"", pais2);
		
		System.out.println(a1.toString());
		System.out.println(a1.verificaSituacao());

		System.out.println(a2.toString());
		System.out.println(a2.verificaSituacao());

		System.out.println(a3.toString());
		System.out.println(a3.verificaSituacao());
		
		System.out.println("\nTotal de Participantes: "+Atleta.getTotalParticipantes());
		}
}
