/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_2;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class PRACTICA_2 {

    public static void main(String[] args) {
       int num1,num2;
       Scanner cap= new Scanner (System.in);
       System.out.println("Ingrese un numero menor:");
       num1=cap.nextInt();
       System.out.println("Ingrese un numero mayor:");
       
       num2=cap.nextInt();
        System.out.println("                       ");
       for (int i=num1; i<=num2;  i++ )
           System.out.println(i);
          System.out.println("////////////////////");
             for(int g=num2; g>=num1; g-- )
                  System.out.println(g);
    
    }
}
