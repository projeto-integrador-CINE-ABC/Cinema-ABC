/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
dora aventureira 
o morto nao falan 
a odiseia dos tontos

 */
package projeto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class filmes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  filme = 0 ,filme1 = 0, filme2 = 0, filme3;
      
        System.out.println("Porfavor esclha um filme a seguir");
        System.out.println(""
                         + "[1] Dora Aventureira\n"
                         + "[2] O Morto Não Falan\n"
                         + "[3] A Odiseia Dos Tolos");

        filme = input.nextInt();
  


        switch (filme){
            case 1 :
                System.out.println("Dora Aventureira");
                filme1++;
                break;
            case 2 :
                System.out.println("O Morto Não Falan");
                filme2++;
                break;
            case 3 :
                System.out.println("A Odiseia Dos Tolos");
                filme3++;
                break;
            default:
                System.out.println("O filme escolido nao e valido");
                
        
    }
    
       input.nextLine();
//       //DECLARAÇÃO DE VARIÁVEIS
        double entrada = 0, meiaEntrada = 0, valorAPagar = 0, valor;
        String nome;

        // Pega a hora do computador Local;
        System.out.println("Hora atual do Sistema::");
        SimpleDateFormat HoraSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm");
       // System.out.println(HoraSistema.format(new Date());

//      System.currentTimeMillis()
        System.out.println();
        //ENTRADA DE DADOS
        System.out.print("Digite seu nome :: ");
        nome = input.nextLine();

        System.out.println("Digite o valor da entrada cheia :: ");
        valor = input.nextDouble();

//-----------------------------------------------------------------------------
//      VALIDA A ENTRADA OU MEIA;
//-----------------------------------------------------------------------------
        do {
            System.out.print("[1] Meia entrada ou [2] cheia :: ");
            entrada = input.nextInt();
            if (entrada == 1) {
                meiaEntrada = valor - (valor * .50);
            } else if (entrada == 2) {
                valorAPagar = valor;
            }
        } while (entrada != 1 && entrada != 2);

//   System.out.printf("%S sua cadeira é a [%S%d]\n", nome, linha, coluna);
        System.out.printf("%S\n", nome);
        
//     System.out.println(+dia + "/" + mes + "/" + ano + " " + data);
        System.out.printf("Valor da meia entrada %.2f\n", meiaEntrada);
        System.out.printf("Valor da Entrada cheia %.2f\n", valorAPagar);
        System.out.printf("valor Total:: %.2f\n", valorAPagar + meiaEntrada);
        System.out.println(filme1);
        System.out.println(filme2);
    }
}

