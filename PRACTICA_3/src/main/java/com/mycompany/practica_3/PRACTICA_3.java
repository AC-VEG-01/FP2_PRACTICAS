/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_3;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class PRACTICA_3 {

    public static void main(String[] args) {
             String Texto;
               Scanner cap= new Scanner (System.in);
              
               System.out.println("Ingrese un texto");
               Texto=cap.nextLine();
         for (int i = 0; i < Texto.length(); i++) {
            char letra = Texto.charAt(i); 
             System.out.println(letra);
               
               
                   
    }
}
}
