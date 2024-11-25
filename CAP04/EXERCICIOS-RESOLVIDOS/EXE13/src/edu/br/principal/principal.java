package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		float sal = 0, imp = 0, aum = 0, novo_sal;
		int op;
		
		System.out.println("MENU DE OPÇÕES");
		System.out.println("1 - IMPOSTO");
		System.out.println("2 - NOVO SALÁRIO");
		System.out.println("3 - CLASSIFICAÇÃO");
		System.out.println("DIGITE A OPÇÃO DESEJADA");
		op = sc.nextInt();
		
		if(op==1) {
			System.out.println("Salário:");
			sal= sc.nextFloat();
			
			if(sal<500) {
				imp=sal*5/100;
			}
			else if(sal>=500 && sal<=850) {
				imp=sal*10/100;
			}
			else if(sal>850) {
				imp=sal*15/100;
			}
			System.out.print(imp);
		}
		
		else if(op==2) {
			System.out.println("Salário:");
			sal= sc.nextFloat();
		
	    	if(sal>1500) {
		    	aum=25;
		}
	    	else if(sal>=750 && sal <=1500) {
		    	aum=50;
		}
		    else if(sal>=450 && sal<750) {
			    aum=75;
		}
		    else if(sal<450) {
			    aum=100;
		}
		    novo_sal=sal+aum;
		
		    System.out.print(novo_sal);
		}
	
	
   	  if(op==3) {
		System.out.println("Salário:");
		sal= sc.nextFloat();
		
		if(sal<= 700) {
			System.out.println("Mal Remunerado");
		}
		else if(sal>700) {
			System.out.println("Bem Remunerado");
		}
		
	}
   	  else if(op<1 || op>3) {
   		System.out.println("Opção Inválida");
   	  }
   
}
}
