package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod, num_h, cont_m = 0, cont_f = 0, sal_b, sal_l, media_m = 0, media_f = 0;
        String sexo;
        
        System.out.println("Digite o codigo: ");
		cod = sc.nextInt();
		
		sal_l = 0;
		while ( cod != 99999) {
			System.out.println("Digite o sexo (M — masculino; F — feminino): ");
			sexo = sc.next();
			System.out.println("Digite o numero de horas: ");
			num_h = sc.nextInt();
			sal_b = num_h * 30;
			if (sexo.equals("M")) {
				sal_l = sal_b - (sal_b * 10 / 100);
				media_m = media_m + sal_l;
				cont_m = cont_m + 1;
			}
			else if (sexo.equals("F")) {
				sal_l = sal_b - (sal_b * 5 / 100);
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
			}
			System.out.println("O codigo é: " + cod);
			System.out.println("O salario bruto é: " + sal_b);
			System.out.println("O salario liquido é: " + sal_l);
			System.out.println("Digite o codigo: ");
			cod = sc.nextInt();
		}
		if (cont_m == 0) {
			System.out.println("Nenhum professor do sexo masculino");
		}
		else {
			media_m = media_m / cont_m;
			System.out.println("A media masculina é de: " + media_m);
		}
		if (cont_f == 0) {
			System.out.println("Nenhum professor do sexo feminino");
		}
		else {
			media_f = media_f / cont_f;
			System.out.println("A media é feminina de: " + media_m);
		}
		
	}
}