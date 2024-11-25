package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int angulo, voltas;
		
		System.out.println("Digite o ângulo:");
		angulo=sc.nextInt();
		
		if(angulo>360 || angulo<-360) {
			voltas=angulo/360;
			angulo=angulo%360;
		}
		    else {
		    	voltas=0;
		}
		if(angulo==0 || angulo==90 || angulo==180 || angulo==270 || angulo==360 || angulo==-90 || angulo==-180 ||  angulo==-270 || angulo==-360) {
			System.out.println("Está em cima de algum dos eixos.");
		}
		else if(angulo>0 && angulo>90 || angulo<-270 && angulo>-360) {
			System.out.println("PRIMEIRO QUADRANTE");
		}
		else if(angulo>90 && angulo<180 || angulo<-180 && angulo>-270) {
			System.out.println("SEGUNDO QUADRANTE");
		}
		else if(angulo>180 && angulo<180 || angulo<-90 && angulo>-180) {
			System.out.println("TERCEIRO QUADRANTE");
		}
		else if(angulo>270 && angulo<360 || angulo<0 && angulo>-90) {
			System.out.println("QUARTO QUADRANTE");
		}
		System.out.println(voltas+",volta(s) no sentido");
		if(angulo<0) {
			System.out.println("horário");
		}
		else {
			System.out.println("anti-horário");
		}

	}

}
