package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ia.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ia.nextInt();
		System.out.println("Agora coloque um quarto número, fora da ordem!: ");
		num4 = ia.nextInt();
		
		if (num4 > num3) {
			System.out.print("A ordem decrescente é:" + num4 + ", " + num3 + ", " + num2 + " e " + num1);
		}
		else if (num4 > num2 && num4 < num3) {
			System.out.print("A ordem decrescente é:" + num3 + ", " + num4 + ", " + num2 + " e " + num1);
		}
		else if (num4 > num1 && num4 < num2 ) {
			System.out.print("A ordem decrescente é:" + num3 + ", " + num2 + ", " + num4 + " e " + num1);
		}
		else if (num4 < num1) {
			System.out.print("A ordem decrescente é:" + num3 + ", " + num2 + ", " + num1 + " e " + num4);
		}
	}

}
