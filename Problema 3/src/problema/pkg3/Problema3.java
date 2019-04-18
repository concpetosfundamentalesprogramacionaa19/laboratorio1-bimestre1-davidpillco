/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;
import java.util. Scanner;
/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        String nota1;
        String nota2;
        String nota3;
        double prom;
        
        //Ingresar las notas
        System.out.printf("Ingrese la nota 1 \n");
        nota1 = entrada.nextLine();
        System.out.printf("Ingrese la nota 2 \n");
        nota2 = entrada.nextLine();
        System.out.printf("Ingrese la nota 3 \n");
        nota3 = entrada.nextLine();
        
        //Promedio
        
        prom= ((Double.parseDouble(nota1)+Double.parseDouble(nota2)
                + Double.parseDouble(nota3))/3);
        String resultado = prom >= 14? "Usted ha pasado el año":
                "Usted no ha pasado de año";
        //presentando el resultado
        System.out.printf("Su promedio es de: %f\n Por consecuencia %s"
                ,prom,resultado);
    }
    
}
