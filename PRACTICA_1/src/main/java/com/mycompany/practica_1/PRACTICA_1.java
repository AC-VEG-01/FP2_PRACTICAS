/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_1;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class PRACTICA_1 {

    public static void main(String[] args) {
        String cad;
        int num;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingrese un texto:");
        cad = cap.nextLine();
        
        System.out.println("Ingrese el numero de repeticiones:");
        num = cap.nextInt();
        
        for (int i=0; i < num; i++) {
            System.out.println(cad);
        }
            
    }
}

