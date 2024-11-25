package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float altura, peso;
		
		System.out.println("Digite a altura:");
		altura=sc.nextFloat();
		System.out.println("Digite o peso: ");
		peso=sc.nextFloat();
		
		if (altura<1.20){
			if(peso<=60) {
				System.out.println("A");
			}
			else if(peso>60 && peso<=90) {
				System.out.println("D");
			}
			else if(peso>90) {
				System.out.println("G");
			}
		}
		
		else if(altura>=1.20 && altura<=1.70) {
			if(peso<=60) {
				System.out.println("B");
			}
			else if(peso>60 && peso<=90) {
				System.out.println("E");
			}
			else if(peso>90) {
				System.out.println("H");
			}
		}
		
		else if(altura>1.70) {
			if(peso<=60) {
				System.out.println("C");
			}
			else if(peso>60 && peso<=90) {
				System.out.println("F");
			}
			else if(peso>90) {
				System.out.println("I");
			}
		}
		
		
	}

}
