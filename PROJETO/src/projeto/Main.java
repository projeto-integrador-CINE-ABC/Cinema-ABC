/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeus;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Zeus {

    static int c1[][] = new int[10][10];
    static int conta_vendas, ContaMeia, ContaCheia;
    static double caixa, meia, cheia, valorAPagar;
    static double valor = 25.00;

    

    String filmeA;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sair = 0;
        
//ETAPA 1- ENTRADA DE BOAS VINDAS.
  //      ClasseMensagem texto = new ClasseMensagem();
    //    texto.exibeMensagem();

//ETAPA 1.1 - CRIAÇÃO DA TELA 
        while (sair != 3) {
            System.out.println("\n---------------------------------------------");
            System.out.println("(1) - MOSTRA E ESCOLHAR O FILME");
            System.out.println("(2) - RELATORIO DE VENDAS");
            System.out.println("(3) - VERIFICA LUGARES DISPONIVEIS");
            System.out.println("(4) - VENDAS");
            System.out.println("(5) - REEPRESÃO");
            System.out.println("(6) - SAIR");
            System.out.println("---------------------------------------------");
            int menu = input.nextInt();
            switch (menu) {
                case 4: {
                    iniciavenda();
                    break;
                }
                case 2: {
                    relatorio();
                    break;
                }
                case 3: {
                    consultar();
                    break;

                }
                case 1: {
                    filmes();
                    break;
                }
                case 5: {
                    consultarlugar();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
            }

        }

    }
// 2° - TELA DE PROCESSAMENTO DA VENDAS ========================================

    private static void iniciavenda() {
        Scanner input = new Scanner(System.in);
        int coluna = 0;
        String linha = null;
        int entrada, ContaEntrada, EntradaColuna;
        ContaEntrada = 0;
        do {
            System.out.print("[1] Meia entrada ou [2] cheia :: ");
            entrada = input.nextInt();

//----------    VALOR DA MEIA ENTRADA ------------------------------------------
            if (entrada == 1) {
                meia = valor - (valor * .50);
                ContaMeia++;
                System.out.printf("Valor da meia entrada R$ %.2f Quantidade: %d%n", meia, ContaMeia);

                System.out.println("\nDigite a linha desejada: ");
                System.out.println("[A B C D E F G H I J]: ");
                linha = input.next();

                do {
                    System.out.println("Digite a coluna desejada: ");
                    System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
                    EntradaColuna = input.nextInt();

                    if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                        coluna = EntradaColuna;
                        vetores(linha.charAt(0), coluna);
                    } else {

                        System.out.println("Valor invalido. Venda Cancelada. favor tentar novamente...");
                        System.out.printf("%.2f", meia);
                        ContaMeia--;
                    }

                } while (EntradaColuna >= 10 && EntradaColuna <= 0);

            } // VALOR DA ENTRADA CHEIA;
            else if (entrada == 2) {
                valorAPagar = valor;
                ContaCheia++;
                System.out.printf("Valor da Entrada Cheia R$ %.2f Quantidade: %d%n", valorAPagar, ContaCheia);
//                System.out.printf("teste do valor: R$ %.2f%n", valor);
//                System.out.printf("teste valor Cheia: R$ %.2f%n", valorAPagar);
                System.out.println("");
                System.out.println("\nDigite a linha Cadeira: ");
                System.out.println("[A B C D E F G H I J]: ");
                linha = input.next();
                do {
                    System.out.println("Digite a coluna desejada: ");
                    System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
                    EntradaColuna = input.nextInt();
                    if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                        coluna = EntradaColuna;
                        
                        vetores(linha.charAt(0), coluna);
                    } else {
                        System.out.println("Valor invalido, favor tentar novamente...");
//                        valor -= valor;
                        ContaCheia--;
                    }
                } while (EntradaColuna >= 10 && EntradaColuna <= 0);
            }
            // Conta todas as entradas
            ContaEntrada++;

        } while (entrada != 1 && entrada != 2);

//        System.out.println("\nDigite a linha desejada: ");
//        System.out.println("[A B C D E F G H I J]: ");
//        linha = input.next();
        // Armazena dados na coluna
//        int EntradaColuna;
//        do {
//            System.out.println("Digite a coluna desejada: ");
//            System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
//            EntradaColuna = input.nextInt();
//
//            if (EntradaColuna <= 9 && EntradaColuna >= 0) {
//                coluna = EntradaColuna;
//                vetores(linha.charAt(0), coluna);
//            } else {
//
//                System.out.println("Valor invalido, favor tentar novamente...");
//                meia -= meia;
//            }
//
//        } while (EntradaColuna >= 10 && EntradaColuna <= 0);
//        System.out.println("Digite a coluna desejada: ");
//        System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
//        int EntradaColuna = input.nextInt();
//
//        if (EntradaColuna <= 9 && EntradaColuna >= 0) {
//            coluna = EntradaColuna;
//            vetores(linha.charAt(0), coluna);
//        } else {
//            System.out.println("opção maior que 9");
//        }
//        vetores(linha.charAt(0), coluna);
    }

    // 3° - TELA DE PROCESSAMENTO DO RELATORIO
    private static void relatorio() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------- RELATÓRIO ANALITICO DE VENDAS ------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total de Ingressos Vendidos: " + conta_vendas);
        System.out.printf("Total em Reais: R$ %.2f%n", caixa);

//        System.out.printf("Total em meia Entrada: R$ %.2f%n", meia);
        System.out.println("******************************************************************");
        System.out.println("VALOR DA MEIA ENTRADA:");
        System.out.printf("JOEL - Valor da meia entrada R$ %.2f \t\tQuantidade: %d%n", meia * ContaMeia, ContaMeia);
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("\nVALOR DA CHEIA");
        System.out.printf("JOEL - valor a pagar: R$ %.2f \t\t\tQuantidade: %d%n", valorAPagar, ContaCheia);
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("SOMA TOTAL = MEIA + CHEIA:");
        System.out.printf("JOEL - valor a pagar: R$ %.2f \t\t\tQuantidades: %d%n", valorAPagar + (meia * ContaMeia),ContaMeia + ContaCheia);
        System.out.println("------------------------------------------------------------------");
        
        

        System.out.println("\nRelação de Poltronas Vendidas: ");
        for (int linha = 0; linha < c1.length - 1; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (c1[linha][coluna] != 0) {
                    System.out.println("Cadeira [" + (char) ('A' + linha) + "" + coluna + "] vendida.");
                }
            }
        }
        System.out.println("");
        System.out.println("******************************************************************");

    }

    // OPÇÃO 3:
    //      4° - PROCESAMENTO DA CONSULTA
    //      verificar as cadeiras Livres.
    private static void consultar() {
        for (int i = 0; i < 10; i++) {                  // para cada linha
            for (int j = 0; j < c1.length; j++) {       //para cada coluna da linha
                System.out.print("[");                  // Inicia a impressao do lugar
                if (c1[i][j] == 0) {                    // testa se está livre
                    // imprime o número da cadeira livre
                    System.out.print((char) ('A' + i) + "" + j); 
                }else{
                    // Como não está livre, imprime dois espacos em branco
                    System.out.print("  ");                      
                }
                // Finaliza a impressao do lugar e acrescenta dois espaços para separar um lugar do outro
                System.out.print("]  "); 
            }
            // Pula uma linha para a nova fileira de cadeiras
            System.out.println(); 
        }
    }

    public static void vetores(char linha, int col) {
        int lin = (int) linha - 'a';
//            lin = (int) linha - 'A';

        switch (c1[lin][col]) {
            case 0:
                if (lin <= 9) {
                    System.out.println(lin);
//                    double preco = meia;
                    System.out.println("Posição livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("=   VENDA EFETUADA COM SUCESSO   =");
                    System.out.println("----------------------------------");
                    caixa = caixa + meia;
                    conta_vendas++;

                } else if (col >= 10) {
//                    double preco2 = valor;
//                    System.out.println("Posicão livre");
//                    c1[lin][col] = 1;
//                    System.out.println("----------------------------------");
//                    System.out.println("->  VENDA EFETUADA COM SUCESSO  <-");
//                    System.out.println("----------------------------------");
//                    caixa = caixa + valor;
//                    conta_vendas++;
                } else {
//                    double preco2 = valor;
                    System.out.println("Posicão livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("->  VENDA EFETUADA COM SUCESSO  <-");
                    System.out.println("----------------------------------");
                    caixa = caixa + valor;
                    conta_vendas++;
                }
                break;
            case 1:
                System.out.println("----------------------------------");
                System.out.println("----->   ESPAÇO VENDIDO    <------");
                System.out.println("----------------------------------");
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.println("----->   ESPAÇO RESERVADO  <------");
                System.out.println("----------------------------------");
                break;
            default:
        }

    }
// --------------------------------- FILMES ---------------------------------
//===========================================================================

    private static void filmes() {
        Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int t = 0;
        //variavel que vai dar o rumo a escolha do filme
        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao;
        //variavel que  vai contar os filmes escolhidos
        int cont_filme1, cont_filme2, cont_filme3;
        //inicializando variavel dos cont
        cont_filme1 = cont_filme2 = cont_filme3 = 0;

        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("-------------------------------------------------");
                System.out.println("ESCOLHA O FILME ABAIXO:\n"
                        + "A partir das opções aseguir :\n"
                        + "-------------------------------------------------\n"
                        + "(1) Dora Aventureira.    \n"
                        + "(2) O Morto não Fala.    \n"
                        + "(3) A Odiseia dos Tolos.  \n"
                        + "-------------------------------------------------\n");
                filme = input.nextInt();

                //opçoes de filme
                System.out.println();
                switch (filme) {
                    case 1:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 1. ");
                        System.out.println(" (1) Dora Aventureira.  ");
                        System.out.println("-------------------------------------------------");
                        cont_filme1++;
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 2. ");
                        System.out.println(" (2) O Morto Não Fala. ");
                        System.out.println("-------------------------------------------------");
                        cont_filme2++;
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 3. ");
                        System.out.println(" (1) A Odiseia Dos Tolos. ");
                        System.out.println("-------------------------------------------------");
                        cont_filme3++;
                        break;

                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Filme inválido! ");
                        System.out.println(" Por favor tente novamente 1");
                        System.out.println("-------------------------------------------------");
                        t++;
                }

                break;

            } while (filme != 1 || filme != 2 || filme != 3);
            System.out.println("-------------------------------------------------");
            System.out.println("Total de Filmes Escolidos\n");
            System.out.println(" O Publico de Dora Aventureira foi :  " + cont_filme1);
            System.out.println(" O Publico de O Morto Não Fala foi :  " + cont_filme2);
            System.out.println(" O Publico de A Odiseia Dos Tolos  :  " + cont_filme3);

            System.out.println("-------------------------------------------------");
            if (t == 3) {
                System.out.println("-------------------------------------------------");
                System.out.println("Seu número de tentativas acabaram");
                System.out.println("-------------------------------------------------");
                break;
            }

            input.nextLine();
            System.out.println("-------------------------------------------------");
            System.out.print("Deseja continuar : [s] - Sim [n] - Não\n");
            System.out.println("-------------------------------------------------");
            opcao = input.nextLine();

        } while (opcao.equalsIgnoreCase("s"));
        System.out.println("-------------------------------------------------");
        System.out.println(" O Total de Filmes Asistidos foi de : " + (cont_filme1 + cont_filme2 + cont_filme3));
        System.out.println("-------------------------------------------------");
    
    }
    private static void consultarlugar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < c1.length; j++) {
                if (c1[i][j] == 0) {
                    System.out.println((char) ('A' + i) + "" + j + " Livre");
                }
            }
        }
    }
}
