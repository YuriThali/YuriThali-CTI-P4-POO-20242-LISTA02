package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float op = 0, sal, imp = 0, aum = 0, novo_sal;
		
		
		while(true) {
			System.out.println("MENU DE OPÇÕES");
			System.out.println("1- Imposto");
			System.out.println("2- Novo Salário");
			System.out.println("3- Classificação");
			System.out.println("4- Finalizar o Programa");
			System.out.println("Digite a opção desejada: ");
			op=sc.nextFloat();
			
			if (op>4||op<1) {
				System.out.println("Opção inválida !");
			}
			else if(op==1) {
				System.out.println("Digite seu salário: ");
				sal=sc.nextFloat();
				if(sal<500) {
					imp=sal*5/100;
				}
				else if(sal>=500 && sal<=850) {
					imp=sal*10/100;
				}
				else if(sal>850) {
					imp=sal*15/100;
				}
				System.out.println("O valor do seu imposto é: "+imp);
			}
			
			else if(op==2) {
				System.out.println("Digite seu salário atual: ");
				sal=sc.nextFloat();
				
				if(sal>1500) {
					aum=25;
				}
				else if(sal>=750 && sal<=1500) {
					aum=50;
				}
				else if(sal>=450 && sal<750) {
					aum=75;
				}
				else if(sal<450) {
					aum=100;
				}
				novo_sal=sal+aum;
				System.out.println("Seu novo salário é: "+novo_sal);
			}
			
			else if(op==3) {
				System.out.println("Digite seu salário: ");
				sal=sc.nextFloat();
				
				if(sal<=700) {
					System.out.println("MAL REMUNERADO");
				}
				else {
					System.out.println("BEM REMUNERADO");
				}
			}
			
			else if(op==4) {
				break;
			}
			
		}

	}

}
