package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double a, b, c, delta, x1, x2, raiz;
		System.out.println("A: ");
		a = ia.nextDouble();
		System.out.println("B: ");
		b = ia.nextDouble();
		System.out.println("C: ");
		c = ia.nextDouble();
		if (a == 0) {
			System.out.println("Esses valores não formam uma equação de segundo grau!");
		}
		else {
			delta = ( b * b) - (4 * a * c);
			raiz = Math.sqrt(delta);
			if (delta < 0) {
				System.out.println("Não existem raiz real.");
				}
			if (delta == 0) {
				System.out.println("Existem uma raiz real.");
				x1 = (-b) / (2 * a);
				System.out.println("Raiz = " + x1);
				}
			if (delta > 0) {
				System.out.print("Existem duas raízes reais.");
				x1 = (-b + raiz)  / (2 * a);
				x2 = (-b - raiz) / (2*a);
				System.out.println("Raízes: " + x1 + " e " + x2);
				}
	}
	}
}
