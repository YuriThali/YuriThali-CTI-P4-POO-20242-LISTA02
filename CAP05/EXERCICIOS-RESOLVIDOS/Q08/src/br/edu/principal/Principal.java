package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i , n_termos, n1 = 2, n2 = 7, n3 = 3;
		
		System.out.println("Digite o número de termos: ");
        n_termos = sc.nextInt();
        
        System.out.println("O termo 1 é: " + n1);
        System.out.println("O termo 2 é: " + n2);
        System.out.println("O termo 3 é: " + n3);
        
        i = 4;
        
        while ( i != n_termos) {
        	n1 = n1 * 2;
        	System.out.println("O proximo termo é: " + n1);
        	i = i + 1;
        	if (i != n_termos) {
        		n2 = n2 * 3;
        		System.out.println("O proximo termo é: " + n2);
        		i = i + 1;
        		if (i != n_termos) {
        			n3 = n3 * 4;
        			System.out.println("O proximo termo é: " + n3);
        			i = i + 1;
        		}
        	}
        }
        
        
        

	}

}
