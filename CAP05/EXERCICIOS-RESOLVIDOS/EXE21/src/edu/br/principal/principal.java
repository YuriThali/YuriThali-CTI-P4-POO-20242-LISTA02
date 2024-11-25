package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num = 0, soma, qtd, maior = 0, menor = 0, qtd_par;
		float media_par, soma_par, qtd_impar, media, perc, resto = 0;
		
		qtd=0;
		qtd_par=0;
		soma_par=0;
		qtd_impar=0;
		soma=0;
		
		System.out.println("Digite um número: ");
		num=sc.nextInt();
		
		while(num!=30000) {
			
			if(qtd==0) {
				maior=num;
				menor=num;
			}
			
			else {
				if(num>maior) {
					maior=num;
				}
				else if(num<menor) {
					menor=num;
				}
			}
			
		
		
		    soma=soma+num;
		    qtd=qtd+1;
		
		
	     	if(resto%2==0) {
		    	soma_par=soma_par+num;
		    	qtd_par=qtd_par+1;
		}
		
		    else {
	    		qtd_impar=qtd_impar+1;
		      	System.out.println("Digite um número: ");
		    	num=sc.nextInt();
		}
		
		    if(qtd==0) {
			     System.out.println("Nenhum número digitado: ");
		}
     		else {
	    		System.out.println("Soma: "+soma);
		    	System.out.println("Quantidade: "+qtd);
			    media=soma/qtd;
			    System.out.println("Média: "+media);
		    	System.out.println("Maior: "+maior);
		    	System.out.println("Menor: "+menor);
     		}
		    
		if(qtd_par==0) {
				System.out.println("NENHUM PAR");
			}
		else {
				media_par=soma_par/qtd_par;
				System.out.println("Média Par: "+media_par);
			}
		
		
		perc=qtd_impar*100/qtd;
		System.out.println("Percentual: "+perc);
		}
		
}
	}
		
	  


