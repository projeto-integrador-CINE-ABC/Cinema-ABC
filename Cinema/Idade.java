/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author edivan
 */
public class Idade {

    public static void main(String[] args) {

        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu ?"));
        int idade = anoAtual - anoNascimento;
        JOptionPane.showMessageDialog(null, "Voce tem: " + idade + " anos ");

    }

}
