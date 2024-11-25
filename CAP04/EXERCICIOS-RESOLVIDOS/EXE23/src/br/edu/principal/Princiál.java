package br.edu.principal;

import java.util.Scanner;

public class Princiál {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double salmin, nht, coe, salbruto, impos, grat, aux, salliq;
		String turno, categoria;
		System.out.println("Salário minímo: ");
		salmin = ia.nextDouble();
		System.out.println("Turno (M-Manhã, V-Vespertino, N-Noite Obs: Maiusculo!): ");
		turno = ia.next();
		System.out.println("QUantidade de horas trabalhadas no mês: ");
		nht = ia.nextDouble(); 
		System.out.println("Categoria (O-Operário, G-Gerente: ");
		categoria = ia.next();
		if (turno == "M") {
			coe = 0.10 * salmin;
			System.out.println("Coeficiente: " + coe);
		}
		if (turno == "V") {
			coe = 0.15 * salmin;
			System.out.println("Coeficiente: " + coe);
		}
		else {
			coe = 0.12 * salmin;
			System.out.println("Coeficiente: " + coe);
		}
		salbruto = nht * coe;
		System.out.println("Salário Bruto: " + salbruto);
		
		if (categoria == "O") {
			if (salbruto >= 300) {
				impos = 0.05 * salbruto;				
			}
			else { impos = 0.03 * salbruto;
			}
		}
		else {
			if (salbruto >=400) {
				impos = 0.06 * salbruto;
			}
			else {
				impos = 0.04 * salbruto;
			}
		}
		System.out.println("Imposto: " + impos);
		if (turno == "N" && nht > 80) {
			grat = 50.0;
		}
		else {
			grat = 30.0;
		}
		System.out.println("grat: " + grat);
		if (categoria == "O" || coe <= 25.0) {
			aux = 1/3 * salbruto;
		}
		else {
			aux = 1/2 * salbruto;
		}
		System.out.println("Auxilio: " + aux);
		salliq = salbruto - impos + grat + aux;
		System.out.println("Salário Liquído: " + salliq);
		if (salliq < 320.0) {
			System.out.println("Mal Remunerado");
		}
		if (salliq >= 350 && salliq <=600) {
			System.out.println("Normal");
		}
		if ( salliq > 600) {
			System.out.println("Bem Remunerado");
		}
		
	} 

}
