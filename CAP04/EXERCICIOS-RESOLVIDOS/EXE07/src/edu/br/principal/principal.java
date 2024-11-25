package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A, B, C, I;
		
		System.out.println("Digite um valor para A: ");
		A = sc.nextInt();
		System.out.println("Digite um valor para B: ");
		B = sc.nextInt();
		System.out.println("Digite um valor para C: ");
		C= sc.nextInt();
		System.out.println("Digite um valor para I: ");
		I = sc.nextInt();
		
		if(I==1) {
			if(A<B && A<C) {
				if(B<C) {
					System.out.printf("A ordem crescente dos números é: "+ A+"-"+B+"-"+C);
				}
				else {
					System.out.printf("A ordem crescente dos números é: " +A+"-"+C+"-"+B);
				}
			}
			else if(B<A && B<C) {
				if(A<C) {
					System.out.printf("A ordem crescente dos números é: "+B+"-"+A+"-"+C);
				}
				else {
					System.out.printf("A ordem crescente dos números é: "+B+"-"+C+"-"+A);
				}
			}
			if(C<A && C<B) {
				if(A<B) {
					System.out.printf("A ordem crescente dos números é: "+C+"-"+A+"-"+B);
				}
				else {
					System.out.printf("A ordem crescente dos números é: "+C+"-"+B+"-"+A);
				}
			}
			   
		}
		else if(I==2) {
			if(A>B && A>C) {
				if(B>C){
					System.out.printf("A ordem decrescente dos números é: "+ A+"-"+B+"-"+C);
				}
				else {
					System.out.printf("A ordem decrescente dos números é: "+ A+"-"+C+"-"+B);
				}
			}
			else if(B>A && B>C) {
				if(A>C) {
					System.out.printf("A ordem decrescente dos números é: "+B+"-"+A+"-"+C);
				}
				else {
					System.out.printf("A ordem decrescente dos números é: "+B+"-"+C+"-"+A);
				}
			}
			if(C>A && C>B) {
				if(A>B) {
					System.out.printf("A ordem decrescente dos números é: "+C+"-"+A+"-"+B);
				}
				else {
					System.out.printf("A ordem decrescente dos números é: "+C+"-"+B+"-"+A);
				}
			}
			   
		
		}
		else if(I==3) {
			if(A>B && A>C) {
				System.out.printf("A ordem desejada é: "+B+"-"+A+"-"+C);
			}
			else if(B>A && B>C) {
				System.out.printf("A ordem desejada é: "+A+"-"+B+"-"+C);
			}
			else if(C>A && C>B) {
				System.out.printf("A ordem desejada é: "+A+"-"+C+"-"+B);
			}
		}
		else {
			System.out.println("Número inválido, tente novamente.");
		}

	}

}
