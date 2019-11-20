
package Cinema;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class CinemaTeste {

    static int c1[][] = new int[26][21];
    static int conta_vendas;
    static double caixa;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sair = 0;
        int vendedor = 001;
        int vendedor1;
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------SEJA BEM VINDO POR FAVOR INFORME SEUS DADOS ----------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("INSIRA CÓDIGO DO VENDEDOR");
        vendedor1 = input.nextInt();
        if (vendedor == vendedor1) {
            while (sair != 3) {
                System.out.println("-------------------------------------------------");
                System.out.println("(1) - VENDAS");
                System.out.println("(2) - RELATORIO DE VENDAS");
                System.out.println("(3) - VERIFICA LUGARES DISPONIVEIS");
                System.out.println("(4) - EXIT");
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
                        System.exit(0);
                    }
                }

            }

        }
    }

    public static void iniciavenda() {
        Scanner input = new Scanner(System.in);
        int coluna;
        String linha;
        System.out.println("Digite a linha desejada");
        linha = input.next();
        System.out.println("Digite a coluna desejada");
        coluna = input.nextInt();
        vetores(linha.charAt(0), coluna);
    }

    public static void relatorio() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------- RELATÓRIO ANALITICO DE VENDAS ------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total de Ingressos Vendidos: " + conta_vendas);
        System.out.println("Total em Reais: R$ " + caixa);
        System.out.println("Relação de Poltronas Vendidas: ");
        for (int linha = 0; linha < c1.length - 1; linha++) {
            for (int coluna = 0; coluna < 20; coluna++) {
                if (c1[linha][coluna] != 0) {
                    System.out.println("Cadeira " + (char) ('a' + linha) + " " + coluna + " vendida");
                }

            }
        }
        System.out.println("");
        System.out.println("******************************************************************");
    }

    public static void consultar() {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 20; j++) {
                if (c1[i][j] == 0) {
                    System.out.println((char) ('A' + i) + "" + j + " desocupado.");
                }
            }
        }
    }

    public static void vetores(char linha, int col) {
        int lin = (int) linha - 'a';

        switch (c1[lin][col]) {
            case 0:
                if (lin <= 5) {
                    System.out.println(lin);
                    double preco = 10.00;
                    System.out.println("Posicao livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("=   VENDA EFETUADA COM SUCESSO   =");
                    System.out.println("----------------------------------");
                    caixa = caixa + preco;
                    conta_vendas++;
                } else {
                    double preco2 = 25.00;
                    System.out.println("Posicao livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("->  VENDA EFETUADA COM SUCESSO  <-");
                    System.out.println("----------------------------------");
                    caixa = caixa + preco2;
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

}

