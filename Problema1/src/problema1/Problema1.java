/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util. Scanner;
/**
 *
 * @author Usuario
 */
public class Problema1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       Double descuento;
       Double suelmensual;
       int numhoras;
       double costohora;
       double pagosinsegu;
       double sueltotal;
               
       System.out.printf("Ingrese el precio que cobra por hora \n");
       costohora = entrada.nextDouble();
       System.out.printf ("Ingrese el numero de horas que trabaja \n");
       numhoras = entrada.nextInt();
       
       //Calculo del pago sin descuento seguro
       
       pagosinsegu = costohora * numhoras;
       suelmensual = pagosinsegu * 0.10;
       sueltotal = pagosinsegu - suelmensual;
       System.out.printf("Su sueldo mensual es de: %f", sueltotal);
       
               
               
      
       
       
    }
    
}
