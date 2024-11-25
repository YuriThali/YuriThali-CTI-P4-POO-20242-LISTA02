package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Digite x: ");
	    x = sc.nextInt();
	    System.out.println("Digite y: ");
	    y = sc.nextInt();
	    System.out.println("Digite z: ");
	    z = sc.nextInt();
	    
	    if (x < y + z && y < x + z && z < x + y ) {
	    	if (x == y && y == z) {
	    		System.out.println("Triangulo Equilátero");
	    }
	    	else if (x == y || x == z || y == z) {
	    		System.out.println("Triangulo Isósceles");
	    }
	    	else if (x != y && x != z && y != z){
	    		System.out.println("Triangulo Escaleno");
	    }
	    }
	    else {
	    	System.out.println("Essas medidas não formam um triangulo");
	    }
		
	}

}
