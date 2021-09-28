package atividades;

import java.util.Scanner;

public class Calculadora {
Scanner ler = new Scanner(System.in);

	public void Calcular() {

		System.out.println("Digite um número: ");
		double num1 = ler.nextDouble();
		System.out.println("Digite um número: ");
		double num2 = ler.nextDouble();

		System.out.println("Digite apenas números:");
		System.out.println("1 - soma\n2 - subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair.");
		Integer opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("A soma dos valores é: " + (num1 + num2));
			break;
		case 2:
			System.out.println("A subtração dos valores é: " + (num1 - num2));
			break;
		case 3:
			System.out.println("A multiplicação dos valores é: " + (num1 * num2));
			break;
		case 4:
			double div = num1 / num2;
			System.out.printf("A divisão de %.2f por %.2f é: %.2f", num1, num2, div);
			break;
		default:
			System.out.println("Fim.");
		}
	}
}
