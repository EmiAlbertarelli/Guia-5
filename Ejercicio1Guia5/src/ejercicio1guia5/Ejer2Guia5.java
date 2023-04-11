/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde
se encuentra el numero y si se encuentra repetido
 */
package ejercicio1guia5;

import java.util.Scanner;


public class Ejer2Guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[N];
        
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int)(Math.random()*20);
        }
       
        
    }
    
}
