package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero:");
		Integer num = null;
		
		//Roda a fun��o novamente se ocorrer o erro.
		while (num == null) {
			num = lerNumero("Falha ao ler seu n�mero.");
		}
		System.out.println("Voc� digitou: " + num);
	}

	//Trata o erro na pr�pria fun��o
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
