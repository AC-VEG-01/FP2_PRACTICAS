/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_5;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class PRACTICA_5 {

    public static void main(String[] args) {
      int num;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num = cap.nextInt();
        
        // Imprimir filas de asteriscos desde 0 hasta num
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Imprimir asterisco
            }
            System.out.println(); // Nueva línea después de cada fila
        }
               }
    }

