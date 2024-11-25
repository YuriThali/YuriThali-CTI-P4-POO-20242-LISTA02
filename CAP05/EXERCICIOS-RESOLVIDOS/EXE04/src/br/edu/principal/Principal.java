package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double fim, i, j, x, expo, ntermos, den , denominador, fat, s;
		
		System.out.println("Número de termos: ");
		ntermos = ia.nextDouble();
		System.out.println("X: ");
		x = ia.nextDouble();
		s = 0.0;
		denominador = 0.0;
		for (i =1.0; i == ntermos; i++) {
			fim = denominador;
			fat = 1.0;
			for (j= 1.0; j==fim; j++) {
				fat = fat * j;
			}
			expo = i * 1.0;
			if ((expo/2) == 0.0) {
				s = s - (Math.pow(x, expo)/fat);
			}
			else {
				s = s + (Math.pow(x,expo)/fat);
			}
			if (denominador == 4) {
				den = 1.0;
			}
			else if (denominador == 1) {
				den = 1.0;	
			}
			if (den == 1.0) {
				denominador = denominador + 1.0;
			}
			else {
				denominador = denominador - 1.0;
			}
			
		}
		System.out.println(s);



	}

}
