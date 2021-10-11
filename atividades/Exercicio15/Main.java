package exercicio5;

public class Main {

	public static void main(String[] args) {

		BebidaAlcoolica cerveja = new BebidaAlcoolica("Cerveja", 12, 8);
		BebidaAlcoolica vinho = new BebidaAlcoolica("Vinho", 150, 12);
		Eletrodomestico tv = new Eletrodomestico("Tv", 2000, 110);
		Eletrodomestico geladeira = new Eletrodomestico("Geladeira", 2352.64, 220);
		Eletrodomestico radio = new Eletrodomestico("Rádio", 837.59, 110);
		ControlePagamento cp = new ControlePagamento();

		cerveja.vender(5);
		cp.calculaTotalPago(cerveja);
		
		vinho.vender(3);
		cp.calculaTotalPago(vinho);
		
		tv.vender(9);
		cp.calculaTotalPago(tv);
		
		geladeira.vender(3);
		cp.calculaTotalPago(geladeira);
		
		radio.vender(1);
		cp.calculaTotalPago(radio);
		
		
		System.out.println(cerveja);
		System.out.println(vinho);
		System.out.println(tv);
		System.out.println(geladeira);
		System.out.println(radio);		
		System.out.println(cp);
	}
}