package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float pre, venda, novo_pre = 0;
		
		System.out.println("Preço atual: ");
		pre= sc.nextFloat();
		
		System.out.println("Venda média mensal: ");
		venda= sc.nextFloat();
		
		if(venda<500 || pre<30) {
			novo_pre= pre+10/100*pre;
		}
		else if(venda>=500 && venda<1200 || pre>=30 && pre<80){
			novo_pre=pre+15/100*pre;
		}
		else if(venda>=1200 || pre>=80) {
			novo_pre=pre-20/100*pre;
		}
		System.out.print(novo_pre);
	}

}
