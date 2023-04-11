/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_Arreglos;
import java.util.*;
/**
 *
 * @author Chiva
 */
public class Extra_Ejerc2_Comparar_Vectores {

    /**
     Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación
     *deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];

        for (int i = 0; i < 4; i++) {
            vector1[i] = random.nextInt(10) + 1;
            vector2[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < 4; i++) {
            if (vector1[i] != vector2[1]) {
                System.out.println("Hay diferencias");
                break;
            } else {
                System.out.println("Los vectores son iguales.");
                break;
            }
        }
    }

}
