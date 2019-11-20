/*
 Tema: Venda de Ingresso de Cinema
 Contextualização:

 A empresa Cine ABC deseja automatizar sua bilheteria, para isso, está contratando sua empresa de 
 desenvolvimento de software para a construção desse sistema.
 O software solicitado deverá conter no mínimo as seguintes funcionalidades:
 1. Comprar Ingresso: essa funcionalidade deverá permitir com que o usuário selecione qual poltrona 
 irá ocupar, bem como se irá pagar meia entrada ou inteira.
 2. Imprimir Ingresso: essa funcionalidade deverá permitir com que o usuário imprima em tela o 
 comprovante do ingresso comprado pelo mesmo. 
 3. Estatística de Vendas: montar um relatório apresentando qual o filme teve mais ingressos vendidos, 
 qual sessão teve maior e menor ocupação de poltronas.

 Desafio: Construção de um sistema computacional que atenda as necessidades propostas no problema 
 acima, de forma a percorrer as áreas de conhecimentos necessárias para o desenvolvimento do software, 
 desde o seu planejamento até a entrega do produto final.

 Resultados esperados: Elaboração de um planejamento através de gráfico de Gantt, bem como a criação 
 de um termo de oficialização e abertura do projeto contemplando a metodologia de desenvolvimento utilizada 
 durante o planejamento e execução do projeto, além dos recursos a serem utilizados.
 */
package Cinema;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class CinemaOk {
//    public static void main(String[] args) {

    // Comprar de ingresso. numero da poltrona se e meia ou cheia.
    // imprimi em tela o comerovante.
    // 3. Estatística de Vendas: montar um relatório apresentando qual o filme teve mais ingressos vendidos, 
    //  qual sessão teve maior e menor ocupação de poltronas.
//    public class TesteDeSplit {
    // Data de Nascimento - ok
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       //DECLARAÇÃO DE VARIÁVEIS
        double entrada = 0, meiaEntrada = 0, valorAPagar = 0, valor;
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


//-----------------------------------------------------------------------------
//      escolha do lugar, cadeiras;        
//-----------------------------------------------------------------------------
        // buff
        input.nextLine();
        System.out.println(" Digite a letra da linha:: ");
        String linha = input.nextLine();
        System.out.printf(" Digite a o número da cadeira [%s]; ", linha);
        int coluna = input.nextInt();

        System.out.printf("%S sua cadeira é a [%S%d]\n", nome, linha, coluna);

        //SAÍDA DE DADOS
        System.out.printf("%S\n", nome);
//        System.out.println(+dia + "/" + mes + "/" + ano + " " + data);
        System.out.printf("Valor da meia entrada %.2f\n", meiaEntrada);
        System.out.printf("Valor da Entrada cheia %.2f\n", valorAPagar);
        System.out.printf("valor Total:: %.2f\n", valorAPagar + meiaEntrada);
    }
}
