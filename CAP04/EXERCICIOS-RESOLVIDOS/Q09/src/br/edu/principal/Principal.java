package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempo, dia, mes, ano, hora, min;
		
		
		System.out.println("Digite o dia: ");
		dia = sc.nextInt();
		System.out.println("Digite o mes: ");
		mes = sc.nextInt();
		System.out.println("Digite o ano: ");
		ano = sc.nextInt();
		
		System.out.println("Digite o horário: ");
		tempo = sc.nextInt();
		System.out.println("Digite a hora: ");
		hora = sc.nextInt();
		System.out.println("Digite o min: ");
		min = sc.nextInt();

		System.out.println("Data Atual:" + dia + "/" + mes + "/" + ano );
		
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		else if (mes == 2) {
			System.out.println("Fevereiro");
		}
		else if (mes == 3) {
			System.out.println("Março");
		}
		else if (mes == 4) {
			System.out.println("Abril");
		}
		else if (mes == 5) {
			System.out.println("Maio");
		}
		else if (mes == 6) {
			System.out.println("Junho");
		}
		else if (mes == 7) {
			System.out.println("Julho");
		}
		else if (mes == 8) {
			System.out.println("Agosto");
		}
		else if (mes == 9) {
			System.out.println("Setembro");
		}
		else if (mes == 10) {
			System.out.println("Outubro");
		}
		else if (mes == 11) {
			System.out.println("Novembro");
		}
		else if (mes == 12) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("Mes inválido");
		}

		System.out.println("Hora Atual: " + hora + ":" + min);
		

	}

}
