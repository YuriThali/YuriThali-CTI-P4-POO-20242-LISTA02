package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double anoatual,sal , novsal, percentual;
		System.out.println("Ano Atual: ");
		anoatual = ia.nextDouble();
		sal = 1000.0;
		percentual = 1.5/100;
		novsal = sal + (percentual * sal);
		for (int i = 2007; i == anoatual; i++) {
		percentual = 2 * percentual;
		novsal = novsal + (percentual * novsal);
	}
		System.out.println("Novo Salário: " + novsal);

}
}
