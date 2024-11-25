package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        int n_termos, x, expoente, fat, denominador = 1, den = 1;
	        double s = 0;
	        
	        System.out.print("Digite o número de termos: ");
	        n_termos = sc.nextInt();
	        
	        System.out.print("Digite o valor de X: ");
	        x = sc.nextInt();
	        
	        for (int i = 1; i <= n_termos; i++) {
	            int fim = denominador;
	            fat = 1;
	            
	            for (int j = 1; j <= fim; j++) {
	                fat *= j;
	            }
	            
	            expoente = i + 1;
	            
	            if (expoente % 2 == 0) {
	                s -= Math.pow(x, expoente) / fat;
	            } else {
	                s += Math.pow(x, expoente) / fat;
	            }
	            
	            if (denominador == 4) {
	                den = -1;
	            }
	            
	            if (denominador == 1) {
	                den = 1;
	            }
	            
	            if (den == 1) {
	                denominador++;
	            } else {
	                denominador--;
	            }
	        }
	        
	        System.out.println("O valor da série é: " + s);

		
	}

}