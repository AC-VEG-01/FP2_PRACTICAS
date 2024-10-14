/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praactica_4;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class PRAACTICA_4 {

    public static void main(String[] args) {
     String texto;
     System.out.println("Ingrese un texto:");
     Scanner cap = new Scanner (System.in);
     texto=cap.nextLine();
     
       for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
              System.out.print(letra+ " ");
            }
    
    }
    }}
