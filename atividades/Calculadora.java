package atividades;

import java.util.Scanner;

public class Calculadora {
Scanner ler = new Scanner(System.in);

	public void Calcular() {

		System.out.println("Digite um n�mero: ");
		double num1 = ler.nextDouble();
		System.out.println("Digite um n�mero: ");
		double num2 = ler.nextDouble();

		System.out.println("Digite apenas n�meros:");
		System.out.println("1 - soma\n2 - subtra��o\n3 - Multiplica��o\n4 - Divis�o\n5 - Sair.");
		Integer opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("A soma dos valores �: " + (num1 + num2));
			break;
		case 2:
			System.out.println("A subtra��o dos valores �: " + (num1 - num2));
			break;
		case 3:
			System.out.println("A multiplica��o dos valores �: " + (num1 * num2));
			break;
		case 4:
			double div = num1 / num2;
			System.out.printf("A divis�o de %.2f por %.2f �: %.2f", num1, num2, div);
			break;
		default:
			System.out.println("Fim.");
		}
	}
}
