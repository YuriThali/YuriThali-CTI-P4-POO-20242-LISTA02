package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double resto;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		resto = num % 2;
		if (resto == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
				
	}

}
