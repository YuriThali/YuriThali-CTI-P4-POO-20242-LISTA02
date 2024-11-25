package principal.edu.br;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cont, codigo = 0,nht = 0;
		float sal_min, sal_inicial, aux, sal_final, valor = 0;
		String turno, categoria;
		
		sal_min=450;
		for(cont=1;cont<=10;cont++) {
			System.out.println("Código: ");
			codigo=sc.nextInt();
			System.out.println("Número de horas trabalhadas: ");
			nht=sc.nextInt();
			System.out.println("Turno: ");
			turno=sc.next();
			System.out.println("Categoria: ");
			categoria=sc.next();
			while(turno!="M" && turno!="V" && turno!="N") {
				System.out.println("Turno: ");
				turno=sc.next();
				break;
			}
			while(categoria!="G" && categoria!="O") {
				System.out.println("Categoria: ");
				categoria=sc.next();
				
			}
			if(categoria=="G") {
				if(turno=="N") {
					valor=sal_min*18/100;
				}
				else {
					valor=sal_min*10/100;
				}
			}
			else {
				if(turno=="V") {
					valor=sal_min*13/100;
				}
				else {
					valor=sal_min*10/100;
				}
			}
			break;
		}
      sal_inicial=nht*valor;
      if(sal_inicial<=300) {
    	  aux=sal_inicial*20/100;
      }
      else {
    	  if(sal_inicial<=600) {
    		  aux=sal_inicial*15/100;
    	  }
    	  else {
    		  aux=sal_inicial*5/100;
    	  }
      }
      sal_final=sal_inicial+aux;
      System.out.println("CÓDIGO :"+codigo);
      System.out.println("NÚMERO DE HORAS TRABALHADAS :"+nht);
      System.out.println("VALOR DA HORA TRABALHADA :"+valor);
      System.out.println("SALÁRIO INICIAL :"+sal_inicial);
      System.out.println("AUXÍLIO ALIMENTAÇÃO :"+aux);
      System.out.println("SALÁRIO FINAL :"+sal_final);

	}

}
