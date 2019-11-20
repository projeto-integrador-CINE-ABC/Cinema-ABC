/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.abc;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Filmes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int  t = 0;
        //variavel que vai dar o rumo a escolha do filme
        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao;
        //variavel que vai controlar o if e suas respectivas condiçoes
        boolean tentativa = true;

        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("Qaul filme vc ira asistir,\n"
                        + "escolha dentre as opçoes abaixo :\n"
                        + "|-----------------------|\n"
                        + "|[1] Dora Aventureira   |\n"
                        + "|[2] O Morto Não Falan  |\n"
                        + "|[3] A Odiseia Dos Tolos|\n"
                        + "|-----------------------|\n");
                        filme = input.nextInt();
                     
              //  if (tentativa) {
//opçoes de filme
                System.out.println();
                    switch (filme) {
                        case 1:
                            System.out.println("|-----------------------|");
                            System.out.println("|Voce escolhel o filme 1|");
                            System.out.println("|-----------------------|");
                            break;
                        case 2:
                            System.out.println("|-----------------------|");
                            System.out.println("|Voce escolhel o filme 2|");
                            System.out.println("|-----------------------|");
                            break;
                        case 3:
                            System.out.println("|-----------------------|");
                            System.out.println("|Voce escolhel o filme 3|");
                            System.out.println("|-----------------------|");
                            break;
                        default:
                            System.out.println("|------------------------|");
                            System.out.println("|filme invalido|");
                            System.out.println("|Porfavor tente novamente|");
                            System.out.println("|------------------------|");
                            t++;
                    }

                    break;
                //} else if (filme != 1 || filme != 2 || filme != 3) {

                //}
            } while (filme != 1 || filme != 2 || filme != 3);

            if (t == 3) {
                System.out.println("seu numero de tentativas acabaram");
                break;
            }
           
               input.nextLine();
               System.out.println();
//       //DECLARAÇÃO DE VARIÁVEIS
        double entrada = 0, meiaEntrada = 0, valorAPagar = 0, valor;
        String nome;

//      System.currentTimeMillis()
        System.out.println();
        //ENTRADA DE DADOS
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite o valor da entrada inteira: ");
        valor = input.nextDouble();
            System.out.println();
//-----------------------------------------------------------------------------
//      VALIDA A ENTRADA OU MEIA;
//-----------------------------------------------------------------------------
        do {
            System.out.print("[1] Meia entrada ou [2] inteira: ");
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
        System.out.printf("Valor da inteira %.2f\n", valorAPagar);
        System.out.printf("valor Total:: %.2f\n", valorAPagar + meiaEntrada);
            
            input.nextLine();
            System.out.print("Deseja continuar (SIM/NAO)");
            opcao = input.nextLine();

        } while (opcao.equalsIgnoreCase("sim"));
    }
}
