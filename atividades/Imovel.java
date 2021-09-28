package atividades;

public class Imovel {
	int codimovel;
	String bairro;
	String tipo;
	double valor;
	
	public void reajuste (String tipo, double valor) {
		if (tipo == "casa") {
	        	valor = valor * 1.05;
	        	System.out.println("Valor reajustado a 5%: " + valor);
	     	}
	     	else {
	        	valor = valor * 1.08;
	            	System.out.println("Valor reajustado a 8%: " + valor);
	  	}
	}
	
	public void categoria (double num) {

    		if (num > 50000) {
        		System.out.println("Imóvel de classe A");
    		} if (num >= 10000 && num < 50000 ) {
        		System.out.println("Imóvel de classe B");
    		} if (num < 10000) {
    			System.out.println("Imóvel de classe C");
    		}
    	}
}
