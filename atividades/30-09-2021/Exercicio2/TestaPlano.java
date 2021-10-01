package exercicio1;

public class TestaPlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("LexCorp", "Saude LTDA", "2021RJ");
		Medico m = new Medico("LexCorp", "Dr. Luiz", 1234);
		Anestesista a = new Anestesista("LexCorp", "Dra. Luiza", 56789,"Anestesia Geral");
		ControlePagamento cp = new ControlePagamento();
			
		c.calcularPagamento();
		m.calcularPagamento();
		a.calcularPagamento();
		cp.calculaTotalPago(c);
		cp.calculaTotalPago(m);
				
		System.out.println(c.toString());
		System.out.println(m.toString());
		System.out.println(a.toString());
		System.out.println("Total pago pelo plano: "+cp.getTotal());
	}

}
