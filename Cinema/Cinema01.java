package Cinema;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Cinema01 {
    Scanner input = new Scanner(System.in);

    public static int contador = 0;

    String nome;
    
    
    public static double lhama( double tarifa, int idade, boolean deficiencia, boolean estudante, boolean homem) {
        System.out.println("Digite seu nome:: ");
        
        
        if (deficiencia == true) {
            tarifa = tarifa * 0;
        } else {

            if (homem == true && idade >= 70) {
                tarifa = tarifa * 0;
            }
            if (homem == false && idade >= 65) {
                tarifa = tarifa * 0;

            }
            if (estudante == true) {
                tarifa = tarifa / 2;
            }
        }
        System.out.println("R$" + tarifa);
        contador++;
        return tarifa;
    }

    public static void main(String[] args) {
        /*double total;
         total = lhama(34.0,70,false,false,false);//mulher, idosa
         total = total + lhama(34.0,15,true,false,false);//deficiente
         total = total + lhama(34.0,15,false,true,false);//estudante	
         total += lhama(34.0,65,false,false,true);//homem, adulto
         total += lhama(34.0,14,false,false,false);//menor,não estudante*/

	//	System.out.println ("Total:\t\t" + "R$" + total + "\nNo Pessoas:\t\t" + contador);
        double[] total = new double[5];
        total[0] = lhama(34.0, 70, false, false, false);//mulher, idosa
        total[1] = lhama(34.0, 15, true, false, false);//deficiente
        total[2] = lhama(34.0, 15, false, true, false);//estudante	
        total[3] = lhama(34.0, 65, false, false, true);//homem, adulto
        total[4] = lhama(34.0, 14, false, false, false);//menor,não estudante
        double totalF = 0;
        for (int i = 0; i < total.length; i++) {
            totalF += total[i];

        }
        System.out.println("Total:\t\t" + "R$" + totalF + "\nNo Pessoas:\t\t" + contador);

    }

}
