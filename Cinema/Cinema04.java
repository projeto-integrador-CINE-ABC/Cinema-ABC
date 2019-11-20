/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Cinema04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       //DECLARAÇÃO DE VARIÁVEIS
        double entrada = 0, meiaEntrada = 0, valorAPagar = 0, valor = 25.00;
        String nome;

        // Pega a hora do computador Local;
        System.out.println("Hora atual do Sistema::");
        SimpleDateFormat HoraSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        System.out.println(HoraSistema.format(new Date());

//      System.currentTimeMillis()
        System.out.println();
        //ENTRADA DE DADOS
        System.out.print("Digite seu nome :: ");
        nome = input.nextLine();

//        System.out.println("Digite o valor da entrada cheia :: ");
//        valor = input.nextDouble();

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

//        System.out.printf("%S sua cadeira é a [%S%d]\n", nome, linha, coluna);
//        System.out.printf("%S\n", nome);
        
//        System.out.println(+dia + "/" + mes + "/" + ano + " " + data);
        System.out.printf("Valor da meia entrada %.2f\n", meiaEntrada);
        System.out.printf("Valor da Entrada cheia %.2f\n", valorAPagar);
        System.out.printf("valor Total:: %.2f\n", valorAPagar + meiaEntrada);
    }
}
