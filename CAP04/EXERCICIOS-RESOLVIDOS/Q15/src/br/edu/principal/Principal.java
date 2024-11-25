package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal_min, nht, ndep, nhet, sal_receber, vh, smes, vdep, vhe, imp, sbruto, sliq, grat;
		
		System.out.println("Digite o salário: ");
	    sal_min = sc.nextInt();
	    System.out.println("Digite o número de horas trabalhadas: ");
	    nht = sc.nextInt();
	    System.out.println("Digite o dependente: ");
	    ndep = sc.nextInt();
	    System.out.println("Digite a hora extra: ");
	    nhet = sc.nextInt();
	    vh = 1/5 * sal_min;
	    smes = nht * vh;
	    vdep = 32 * ndep;
	    vhe = nhet * (vh +(vh * 50/100));
	    sbruto = smes + vdep + vhe;
	    imp = 0;
	    grat = 0;
	    if (sbruto < 200) {
	    	imp = 0;
	    }
	    else if (sbruto >= 200 && sbruto <= 500) {
	    	imp = sbruto * 10 /100;
	    }
	    else if (sbruto > 500) {
	    	imp = sbruto * 20/100;
	    	
	    }
	    sliq = sbruto - imp;
	    
	    if (sliq <= 350) {
	    	grat = 100;
	    }
	    else if (sliq > 350) {
	    	grat = 50;
	    }
	    
	    sal_receber = sliq + grat;
	    
	    System.out.println("O salário a ser recebedido é: " + sal_receber);
	
	
	
	
		
	}

}
