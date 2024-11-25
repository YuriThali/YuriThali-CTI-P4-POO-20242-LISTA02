package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double x, num2, soma, raiz, op;
		
		System.out.println("1 - Somar 2 números.");
		System.out.println("2 - Raiz quadrada de um número.");
		System.out.println("Digite sua Opção: ");
		op = ia.nextDouble();
		if (op == 1) {
			System.out.println("Digite um valor para o primeiro número: ");
			x = ia.nextDouble();
			System.out.println("Digite o segundo valor agora: ");
			num2 = ia.nextDouble();
			soma = x + num2;
			System.out.println("A soma de " + x + " e " + num2 + " é " + soma);
		}
		if (op == 2) {
			System.out.print("Digite um valor: ");
			x = ia.nextDouble();
			raiz = Math.sqrt(x);
			System.out.println("A raiz quadrada de " + x + " é " + raiz);
		}
		if (op != 1 && op != 2) {
			System.out.println("Opção inválida!");
		}
	}

}
