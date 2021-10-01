package exercicio5;

public class Main {

	public static void main(String[] args) {

		BebidaAlcoolica cerveja = new BebidaAlcoolica("Cerveja", 12, 8);
		BebidaAlcoolica vinho = new BebidaAlcoolica("Vinho", 150, 12);
		Eletrodomestico tv = new Eletrodomestico("Tv", 2000, 110);
		Eletrodomestico geladeira = new Eletrodomestico("Geladeira", 2352.64, 220);
		Eletrodomestico radio = new Eletrodomestico("Rádio", 837.59, 110);

		System.out.println(cerveja.toString());
		cerveja.valorTotal(5);
		System.out.println(vinho.toString());
		vinho.valorTotal(3);
		System.out.println(tv.toString());
		tv.valorTotal(9);
		System.out.println(geladeira.toString());
		geladeira.valorTotal(3);
		System.out.println(radio.toString());
		radio.valorTotal(1);
	}
}
