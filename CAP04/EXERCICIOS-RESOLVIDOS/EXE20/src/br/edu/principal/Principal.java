package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double codprod, pesokg, codpais, pesog, pretotal,valortotal, pregrama, imposto;
		System.out.println("Código do produto: ");
		codprod = ia.nextDouble();
		System.out.println("Peso em kg: ");
		pesokg = ia.nextDouble();
		System.out.println("Codigo do País: ");
		codpais = ia.nextDouble();
		pesog = pesokg * 1000;
		System.out.println("Peso em gramas: " + pesog);
		if (codprod >= 1 && codprod <=4) {
			pregrama = 10.0;
		}
		if (codprod >= 5 && codprod <= 7); {
			pregrama = 25.0;
		}
		if (codprod >= 8 && codprod <=10) {
			pregrama = 35.0;
		}
		pretotal = pesog * pregrama;
		System.out.println("Pré total: " + pretotal);
		if (codpais == 1) {
			imposto = 0.0;
			System.out.println("Imposto: " + imposto);
			valortotal = pretotal + imposto;
			System.out.println("Valor Total: " + valortotal);
		}
		if (codpais == 2) {
			imposto = pretotal * (15/100);
			System.out.println("Imposto: " + imposto);
			valortotal = pretotal + imposto;
			System.out.println("Valor Total: " + valortotal);
		}
		if (codpais == 3) {
			imposto = pretotal * (25/100);
			System.out.println("Imposto: " + imposto);
			valortotal = pretotal + imposto;
			System.out.println("Valor Total: " + valortotal);
		}
		
		
		
	}

}
