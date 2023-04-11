/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si
este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio6guia5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6Guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int fila, columna, diagonal;

        System.out.println("Ingrese los valores entre 1 y 9 para la matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] > 9 || matriz[i][j] < 1) {
                        System.out.println("Reingrese el valor dentro de 1 y 9");
                    }
                } while (matriz[i][j] > 9 || matriz[i][j] < 1);

                // System.out.print(" "+matriz[i][j]+ " ");
            }
            System.out.println("");

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println(sumaDiagonal(matriz));
        System.out.println(sumaFila(matriz, 1));

    }

    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma = suma + matriz[i][j];
                }
            }
        }

        return suma;
    }

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==fila){
                     suma = suma + matriz[fila][j];
                }
                    
            }
        } 
        return suma;

    }
}
