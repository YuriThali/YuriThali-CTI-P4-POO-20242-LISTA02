package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double sal, novosal, boni, aux;
		System.out.println("Salário: ");
		sal = ia.nextDouble();
		if (sal <= 500) {
			boni = sal * 0.05;
			}
		else {
			if (sal <= 1200) {
				boni = sal * 0.12;
			}
			else {
				boni = 0.0;
			}
		}
		if (sal <= 600) {
			aux = 150.0;
		}
		else {
			aux = 100.0;
		}
		novosal = sal + boni + aux;
		System.out.println("Novo salário: " + novosal);
	}

}
