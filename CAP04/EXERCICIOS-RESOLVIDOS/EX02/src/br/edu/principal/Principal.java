package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, media, nota_ex;
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		media = (nota1 + nota2 + nota3)/3;
		System.out.println("Média Aritmética: " + media);
		
		if (0 <= media && media < 3) {
			System.out.println("Reprovado");
		}
		if (3 <= media && media > 7) {
			System.out.println("Exame");
			nota_ex = 12 - media;
			System.out.println("Deve tirar nota" + nota_ex + "para ser aprovado");
		}
		if (7 <= media && media <= 10) {
			System.out.println("Aprovado");
		}
		
	}
    }			
			
		



