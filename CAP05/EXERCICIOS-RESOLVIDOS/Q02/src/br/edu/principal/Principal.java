package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n, fat;
        double e = 1.0; 
       
        System.out.print("Digite um valor inteiro e positivo para N: ");
        n = sc.nextInt();
        
        
        for (int i = 1; i <= n; i++) {
      
            fat = 1;
            for (int j = 1; j <= i; j++) {
                fat = fat * j;
            }
        e += 1.0 / fat;
        }
        
        
        System.out.printf("O valor de E é: " + e);
        
   
		

	}

}
