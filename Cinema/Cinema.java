package Cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author edivan
 */
public class Cinema {

    public static void main(String[] args) {
        int pol[][] = new int[14][40];
        inicializar(pol);
        ingresso(pol);
        disponibilidade(pol);
    }

    public static void inicializar(int pol[][]) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 40; j++) {
                pol[i][j] = 0;
            }
        }
    }

    public static void ingresso(int pol[][]) {
        int k = 1;
        while (k != 0) {
            int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da fila"));
            int j = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da poltrona"));
            if (pol[i][j] == 0) {
                pol[i][j] = 1;
                String nome = JOptionPane.showInputDialog("Digite seu nome,por favor!");
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe!Essa poltrona já está ocupada \n Por favor, escolha outra.");
            }

            k = Integer.parseInt(JOptionPane.showInputDialog("Você quer comprar mais um ingresso?\n 1-sim\n 0-não"));
        }
    }

    public static void disponibilidade(int pol[][]) {
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int m = 0;
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da fila"));
        for (int j = 0; j < 40; j++) {
            if (pol[i][j] == 0) {
                cont++;
                cont2++;
            }
            if (cont == 1) {
                m = j;
                int y = j;

                while (y < 40) {
                    // y++ posicao do incremento antes
                    if (pol[i][y] == 0) {
                        cont3++;

                    } else {
                        break;
                    }
                    y++; // posicao atual do incremento
                }
            }

        }
        System.out.println("Nessa fila existem " + cont2 + " poltronas disponíveis");
        System.out.println("A primeria poltrona livre da fila é a de número " + m);
        System.out.println("E ao lado dessa poltrona há mais " + cont3 + " poltronas livre(s) ");
    }

}
