package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod_est, cod_carga, peso_ton, peso_quilo, pre_carga = 0, imposto, valor_total;
		double per_imposto = 0;
		
		System.out.println("Digite o código do estado estado de origem da carga(1, 2, 3, 4 ou 5): ");
	    cod_est = sc.nextInt();
	    imposto = 0;
	    if (cod_est < 1 || cod_est > 5) {
	    	System.out.println("Código de estado inválido! O código deve ser entre 1 e 5.");
            return;
	    }
	    
	    System.out.println("Digite o peso em toneladas: ");
	    peso_ton = sc.nextInt();
	    System.out.println("Digite o código da carga(entre 10 e 40): ");
	    cod_carga = sc.nextInt();
	    if (cod_carga < 10 || cod_carga > 40) {
	    	System.out.println("Código de estado inválido! O código deve ser entre 10 e  40.");
            return;
	    }
	    
	    peso_quilo = peso_ton * 1000;
	    System.out.println("O tamanho da carga em quilos é:" + peso_quilo);
	    
    	if (cod_carga >= 10 && cod_carga <= 20) {
	    	pre_carga = 100 * peso_quilo;
	    	}
    	else if (cod_carga >= 21 && cod_carga <= 30) {
	    	pre_carga = 250 * peso_quilo;
	    	}
    	else if (cod_carga >= 31 && cod_carga <= 40) {
	    	pre_carga = 340 * peso_quilo;
	    }
	    
	    System.out.println("O preço da carga do caminhão é: " + pre_carga);
	    
    	if (cod_est == 1) {
                per_imposto = 0.35; 
            } else if (cod_est == 2) {
                per_imposto = 0.25;  
            } else if (cod_est == 3) {
                per_imposto = 0.15;  
            } else if (cod_est == 4) {
                per_imposto = 0.05;  
            } else if (cod_est == 5) {
                per_imposto = 0.0;  
            }
	  
	    imposto = (int) (per_imposto * pre_carga);
	    
	     System.out.println("O imposto é: " + imposto);
	     
	     valor_total = pre_carga + imposto;
	     
	     System.out.println("O valor total é: " + valor_total);

	}

}
