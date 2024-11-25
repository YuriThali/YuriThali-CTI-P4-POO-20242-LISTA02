package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_carlos = 0, sal_joao = 0;
		int meses = 0;
		
		System.out.println("Digite o salario do carlos: ");
		sal_carlos = sc.nextDouble();
		
		sal_joao = sal_carlos/3;
		
		while (sal_joao < sal_carlos) {
			sal_carlos += sal_carlos * 2 / 100;
			sal_joao += sal_joao * 5 / 100;
			meses++;
		}
		
		System.out.println("A quantidade de meses necessarias foi de : " + meses);
		

	}

}
