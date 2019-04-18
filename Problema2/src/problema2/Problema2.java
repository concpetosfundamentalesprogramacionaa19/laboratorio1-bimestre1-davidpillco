/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util. Scanner; 
/**
 *
 * @author Usuario
 */
public class Problema2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        String x;
        String y;
        String z;
        double m1;
        double m2;
        double m;
        // Pedir valores         
        System.out.printf("Ingrese el valor de x \n");
        x = entrada.nextLine();
        System.out.printf("Ingrese el valor de y \n");
        y = entrada.nextLine();
        System.out.printf("Ingrese el valor de z \n");
        z = entrada.nextLine(); 
        
        // Procesos
        m1= Double.parseDouble(x)+ (Double.parseDouble(y)/
                Double.parseDouble(z));
                
        m2= Double.parseDouble(x)-(Double.parseDouble(y)/Double.parseDouble
             (z)); 
        m = m1 / m2;
        
        System.out.println(m);
       // Presentacion de resultado
       System.out.printf("El valor de m, en base a las variables:\nx =%s\n  "
               + "y=%s \n   z=%s\nda como resultado:\n\tm=%.2f",x,y,z,m);
              
 
        
        
    }
    
}
