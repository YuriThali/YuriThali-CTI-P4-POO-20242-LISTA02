package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal, qtd, tipo, val_kw, gasto, acresc = 0, total, tot_geral = 0, qtd_cons = 0;
		
		System.out.println("Digite o salario: ");
		sal = sc.nextInt();
		System.out.println("Digite a quantidade de quilowatts: ");
		qtd = sc.nextInt();
		
		val_kw = sal / 8;
		
		while ( qtd != 0) {
			gasto = qtd * val_kw;
			System.out.println("Digite o tipo (1 — residencial; 2 — comercial; ou 3 — industrial): ");
			tipo = sc.nextInt();
			if (tipo == 1) {
				acresc = gasto * 5/100;
			}
			else if (tipo == 2) {
				acresc = gasto * 10 / 100;
			}
			else if (tipo == 3) {
				acresc = gasto * 15 / 100;
			}
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			if (total >= 500 && total <= 1000) {
				qtd_cons = qtd_cons + 1;
			
			}
			System.out.println("O gasto foi de: " + gasto);
			System.out.println("O acrescimo foi de: " + acresc);
			System.out.println("O total foi de: " + total);
			System.out.println("Digite a quantidade: ");
			qtd = sc.nextInt();
		}
		System.out.println("O total geral foi de: " + tot_geral);
		System.out.println("A quantidade de consumidores foi de: " + qtd_cons);
	
	

	}

}
