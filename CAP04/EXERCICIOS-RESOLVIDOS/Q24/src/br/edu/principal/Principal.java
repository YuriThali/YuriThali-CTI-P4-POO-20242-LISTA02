package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double pre, valor_adic , imposto, pre_custo , desconto, novo_pre;
		 String tipo, refrig;
		
		 System.out.print("Digite o preço do produto: R$ ");
	     pre = sc.nextDouble();
	     System.out.print("Digite o tipo do produto (A - Alimentação, L - Limpeza, V - Vestuário): ");
	     tipo = sc.next();
	     System.out.print("Digite a refrigeração (S - Necessita refrigeração, N - Não necessita): ");
	     refrig = sc.next();
	     
	     valor_adic = 0;
	     if (refrig.equals("N")){
	    	 if (tipo.equals("A")){
	    		 if (pre < 15) {
	    			 valor_adic = 2;
	    		 }
	    		 else {
	    			 valor_adic = 5;
	    		 }
	    	 }
	    	 else if (tipo.equals("L")){
	    		 if (pre < 10) {
	    			 valor_adic = 1.50;
	    		 }
	    		 else {
	    			 valor_adic = 2.50;
	    		 }
	    	 }
	    	 else if (tipo.equals("V")){
	    		 if (pre < 30) {
	    			 valor_adic = 3;
	    		 }
	    		 else {
	    			 valor_adic = 2.50;
	    		 }
	    	 }
	     }
	     else {
	    	 if (tipo.equals("A")) {
	    		 valor_adic = 8;
	    		 }
	    	 else if (tipo.equals("L")) {
	    		 valor_adic = 0;
	    		 }
	    	 else if (tipo.equals("V")) {
    			 valor_adic = 0;
    		     }
	     }
	     System.out.println("O valor adicional é de: " + valor_adic);
	     
	     imposto = 0;
	     pre_custo = 0;
	     if (pre < 25) {
	            imposto = 0.05 * pre; 
	     }
	     else {
	            imposto = 0.08 * pre; 
	     }
	     
	     System.out.println("O valor do imposto é de: " + imposto);
	     
	     desconto = 0;
	     if (!tipo.equals("A") && !refrig.equals("S")) {
	    	 desconto = 0.03 * pre_custo;
	     }
	     
	     System.out.println("O desconto é de: " + desconto);
	     
	     novo_pre = pre_custo + valor_adic - desconto;
	     
	     System.out.println("O novo preço é de: " + novo_pre);
	     
	     if (novo_pre <= 50) {
	    	 System.out.println("Barato");
	     }
	     else if (novo_pre < 100) {
	    	 System.out.println("Normal");
	     }
	     else {
	    	 System.out.println("Caro");
	     }
	     
	     }
	}


