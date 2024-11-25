package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num = 0, i, j, fat = 0;
		
		System.out.println("Digite um número: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			System.out.println("Digite um número: ");
			num=sc.nextInt();
			
			fat=1;
		}
		
		for(j=1;j<=num;j++) {
			fat=fat*j;
		}
		
		System.out.println("Fatorial: "+fat);

	}

}
