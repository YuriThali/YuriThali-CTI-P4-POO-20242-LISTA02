package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num_op, num_maior = 0, cont_m, cont_f, cont;
		float pecas_op, tot_pecas, media_f, salario_op = 0, tot_folha, media_m;
		String sexo_op;
		
		tot_folha=0;
		tot_pecas=0;
		media_m=0;
		media_f=0;
		cont_m=0;
		cont_f=0;
		
		float salario_maior = 0;
		for(cont=1;cont<=15;cont++) {
			System.out.println("Digite o número do "+cont+" operário: ");
			num_op=sc.nextInt();
			System.out.println("Digite o sexo do operário ( M ou F )");
			sexo_op=sc.next();
			System.out.println("Digite o total de peças fabricadas paelo "+cont+" operário: ");
			pecas_op=sc.nextInt();
			
			if(pecas_op<=30) {
				salario_op=450;
			}
			else if(pecas_op>30 && pecas_op<=50) {
				salario_op=450+((pecas_op-30)*3/100*450);
			}
			else if (pecas_op > 50) {
                salario_op = (float) (450 + ((pecas_op - 30) * 5 / 100.0 * 450));
            }

           
            System.out.println("O operário de número " + num_op + " recebe o salário: R$ " + salario_op);

          
            tot_pecas += pecas_op;
            tot_folha += salario_op;

        
            if (sexo_op.equalsIgnoreCase("M")) {
                media_m += pecas_op;
                cont_m++;
            } else {
                media_f += pecas_op;
                cont_f++;
            }

          
            if (cont == 0 || salario_op > salario_maior) {
                salario_maior = salario_op;
                num_maior = num_op;
            }
        }


        System.out.println("Total da folha de pagamento: R$ " + tot_folha);
        System.out.println("Total de peças fabricadas no mês: " + tot_pecas);

       
        if (cont_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            media_m /= cont_m;
            System.out.println("Média de peças fabricadas por homens: " + media_m);
        }


        if (cont_f == 0) {
            System.out.println("Nenhuma mulher.");
        } else {
            media_f /= cont_f;
            System.out.println("Média de peças fabricadas por mulheres: " + media_f);
        }


        System.out.println("O número do operário com maior salário é: " + num_maior + " (Salário: R$ " + salario_maior + ")");
		}

	}


