/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio3guia5;

import java.util.Scanner;

public class Ejercicio3Guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int)(Math.random()*10000-10);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        int uno, dos, tres, cuatro, cinco;
        uno = 0; dos = 0; tres = 0; cuatro = 0 ; cinco = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
        }
    }
    
    
}
