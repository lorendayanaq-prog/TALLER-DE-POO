/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
          Scanner in = new Scanner (System.in);
      int num1, num2, suma;
      
      System.out.println ("ingresar valor 1: ");
      num1 = in.nextInt ();
      
       System.out.println ("ingresar valor 2: ");
      num2 = in.nextInt ();
      
      suma = num1 + num2;
      System.out.println("la suma es = "+suma);
     if (suma > 10){
         
         System.out.println("el numero es mayor que 10");
     } else{
       System.out.println("el numero es menor que 10");   
     }
    }
}
    

