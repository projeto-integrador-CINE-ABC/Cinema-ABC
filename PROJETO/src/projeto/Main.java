package zeus;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Zeus {

    static int c1[][] = new int[10][10];
    static int conta_vendas;
    static double caixa, meia = 0, cheia, valor = 25.00, valorAPagar;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sair = 0;

        System.out.println("------------------------------------------------------------------");
        System.out.println("------------SEJA BEM VINDO POR FAVOR INFORME SEUS DADOS ----------");
        System.out.println("------------------------------------------------------------------");

//  ETAPA 1° - CRIAÇÃO DA TELA 
        while (sair != 3) {
            System.out.println("-------------------------------------------------");
            System.out.println("(1) - VENDAS");
            System.out.println("(2) - RELATORIO DE VENDAS");
            System.out.println("(3) - VERIFICA LUGARES DISPONIVEIS");
            System.out.println("(4) - MOSTRAR FILMES");
            System.out.println("(5) - SAIR");
            System.out.println("-------------------------------------------------");
            int menu = input.nextInt();
            switch (menu) {
                case 1: {
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
                case 4: {
                    filmes();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }

        }

    }
// 2° - TELA DE PROCESSAMENTO DA VENDAS

    private static void iniciavenda() {
        Scanner input = new Scanner(System.in);
        int coluna = 0;
        String linha;
        int entrada, ContaEntrada, ContaMeia, ContaCheia;
        ContaEntrada = ContaMeia = ContaCheia = 0;
        
       
        do {
            System.out.print("[1] Meia entrada ou [2] cheia :: ");
            entrada = input.nextInt();
            // buff
            input.nextLine();

            if (entrada == 1) {
//                meia = valor - (valor * .50);
                meia = valor - (valor * .50);
                ContaMeia++;
                System.out.printf("teste de meia: R$ %.2f%n", meia);

            } else if (entrada == 2) {
                valorAPagar = valor;
                ContaCheia++;
                System.out.printf("teste do valor: R$ %.2f%n", valor);
            }
            // Conta todas as entradas
            ContaEntrada++;

        } while (entrada != 1 && entrada != 2);

        System.out.println("\nDigite a linha desejada: ");
        System.out.println("[A B C D E F G H I J]: ");
        linha = input.next();
        
        int EntradaColuna;
        do {
            System.out.println("Digite a coluna desejada: ");
            System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
            EntradaColuna = input.nextInt();

            if (EntradaColuna <= 9 && EntradaColuna >= 0) {
                coluna = EntradaColuna;
                vetores(linha.charAt(0), coluna);
            } else {
                System.out.println("Valor invalido, favor tentar novamente...");
                meia -= meia;
            }
            
        } while (EntradaColuna >= 10 && EntradaColuna <= 0);
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
        System.out.printf("Total em meia: R$ %.2f%n", meia);

        System.out.printf("Total em valor: R$ %.2f%n", valorAPagar + meia);
        System.out.println("Relação de Poltronas Vendidas: ");
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
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < c1.length; j++) {
                if (c1[i][j] == 0) {
                    System.out.println((char) ('A' + i) + "" + j + " Livre");
                }
            }
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

    private static void filmes() {
        Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int t = 0;
        //variavel que vai dar o rumo a escolha do filme
        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao;
        //variavel que vai controlar o if e suas respectivas condiçoes
        boolean tentativa = true;

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
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 2. ");
                        System.out.println(" (2) O Morto Não Fala. ");
                        System.out.println("-------------------------------------------------");
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 3. ");
                        System.out.println(" (1) A Odiseia Dos Tolos. ");
                        System.out.println("-------------------------------------------------");
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
    }
}
