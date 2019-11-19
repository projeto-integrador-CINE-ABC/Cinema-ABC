/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PROJETO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    }
    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);

        int sala[][] = new int[3][4];
        /*
        MAPA DA MATRIZ
        
        sala[f][n] = onde: f é a fileira e n o número da cadeira
        
        sala[f][n] = 0: LIVRE
        sala[f][n] = 1: OCUPADA/RESERVADA
                
        // 0 = Fileira A
        sala[0][0] = 0;
        sala[0][1] = 0;
        sala[0][2] = 0;
        sala[0][3] = 0;
        
        // 1 = Fileira B
        sala[1][0] = 0;
        sala[1][1] = 0;
        sala[1][2] = 0;
        sala[1][3] = 0;
        
        // 2 = Fileira C
        sala[2][0] = 0;
        sala[2][1] = 0;
        sala[2][2] = 0;
        sala[2][3] = 0;
        
		Croqui da sala
		[0][0][0][0]
		[0][1][0][0]
		[0][0][0][0]
		
		Croqui da sala
		[A][A2][A3][A4]
		[B][B2][B3][B4]
		[C][C2][C3][C4]
	
		*/
        

        // Entrada
        System.out.println("Digite a letra da fileira: ");
		//letra_digitada = "B"
		int indice_fileira;
			
		letras = {"A", "B", "C", "D"};
		for(i = 0; i < letras.lenght; i++){
			if(letras[i].equals(letra_digitada)){
				indice_fileira = i;
			}
		}
		
		System.out.println("Digite o numero da poltrona: ");
		//poltrona_digitada = 2
		
		// if(sala[1][1] == 0){
		// if(sala[fileira][cadeira] == 0){
		if(sala[indice_fileira][poltrona_digitada - 1] == 0){
			// LIVRE
		} else {
			// OCUPADA
		}
		
		
        // Processamento
        // Saída
        System.out.println();
    }
}