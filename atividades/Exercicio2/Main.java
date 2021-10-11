package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite um número:");
		Integer num = null;
		
		//Roda a função novamente se ocorrer o erro.
		while (num == null) {
			num = lerNumero("Falha ao ler seu número.");
		}
		System.out.println("Você digitou: " + num);
	}

	//Trata o erro na própria função
	public static Integer lerNumero(String mensagem) {
		try {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			in.close();
			return num;

		} catch (Exception e) {
			System.out.println(mensagem);
			return null;
		}
	}
}
