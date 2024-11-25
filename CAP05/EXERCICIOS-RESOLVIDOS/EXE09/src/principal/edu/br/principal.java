package principal.edu.br;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cont, ta = 0, te = 0, tr = 0;
		float n1, n2, media, media_classe, total_classe;
		
		total_classe=0;
		
		for(cont=1;cont<=6;cont++) {
			 System.out.println("NOTA 1: ");
			 n1=sc.nextFloat();
			 System.out.println("NOTA 2: ");
			 n2=sc.nextFloat();
			 media=(n1+n2)/2;
			 System.out.println("MÉDIA: "+media);
			 
			 if(media<=3) {
				 tr=tr+1;
				 System.out.println("REPROVADO");
			 }
			 else if(media>3 && media< 7) {
				 te=te+1;
				 System.out.println("EXAME");
			 }
			 else if(media>=7) {
				 ta=ta+1;
				 System.out.println("APROVADO");
			 }
			 total_classe=total_classe+media;
			 
		}
		
		 System.out.println("TOTAL DE ALUNOS REPROVADOS: "+tr);
		 System.out.println("TOTAL DE ALUNOA PARA EXAME: "+te);
		 System.out.println("TOTAL DE ALUNOS APROVADOS: "+ta);
		 media_classe=total_classe/6;
		 System.out.println("MÉDIA DA CLASSE: "+media_classe);
		
	}

}
