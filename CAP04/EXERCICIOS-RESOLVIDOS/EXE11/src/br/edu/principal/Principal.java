package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double hora_i, min_i, hora_f, min_f, hora_d, min_d;
		System.out.println("Digite o horário inicial!");
		System.out.println("Hora: ");
		hora_i = ia.nextDouble();
		System.out.println("Minuto: ");
		min_i = ia.nextDouble();
		System.out.println("Digite o horário final");
		System.out.println("Hora: ");
		hora_f = ia.nextDouble();
		System.out.println("Minuto: ");
		min_f = ia.nextDouble();
		if (min_i > min_f) {
			min_f = min_f + 60;
			hora_f = hora_f - 1;
		}
		if (hora_i > hora_f) {
			hora_f = hora_f + 24;
		}
		min_d = min_f - min_i;
		hora_d = hora_f - hora_i;
		System.out.println("O jogo durou " + hora_d + "horas(s) e " + min_d + " Minuto(s)!");
		
		
		
	}

}
