/* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita 
alojar sus nombres más adelante.
 */
package guiateorica1;

import java.util.Scanner;

public class GuiaTeorica1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         String[] equipo = new String[8];
        
         for (int i = 0; i < equipo.length; i++) {
             System.out.println("Ingrese el nombre de un integrante del equipo");
             equipo[i] = leer.nextLine();
                   
        }for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
        }
       
    }
    
}
