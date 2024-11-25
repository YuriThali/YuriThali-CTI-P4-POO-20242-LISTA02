package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 double val_inicial, val_juros, total, val_parc;
	        int juros = 0, num_parc = 1;
	       
	        System.out.print("Digite o valor inicial da dívida: ");
	        val_inicial = sc.nextDouble();
	        
	        total = val_inicial;
	        val_parc = val_inicial;
	        
	        System.out.println("O valor total é de: " + total);
	        System.out.println("O juros é de: " + juros);
	        System.out.println("O numero de parcelas é de: " + num_parc);
	        
	        juros += 10;
	        num_parc  += 2;
	        
	        for (int i = 1; i <= 4; i++) {
	            val_juros = val_inicial * juros / 100;
	            total = val_inicial + val_juros;
	            val_parc = total / num_parc;
	            
	            System.out.println("O valor total é de: " + total);
		        System.out.println("valor do juros é de: " + val_juros);
		        System.out.println("O numero de parcelas é de: " + num_parc);
		        
	            juros += 5;
	            num_parc += 3;
	        }
		 
	   
	}

}
