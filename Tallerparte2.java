/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pood2.taller2;

/**
 *
 * @author ALUMNO#
 */
public class Tallerparte2 {

    public static void main(String[] args) {
        
        
      double celcius;
      double fahrenheit;
      double convertidorCaF;
       double convertidorFaC;
       
       celcius = 25;
       fahrenheit = 77;
       
       convertidorCaF = (celcius * 9/5)+32;
       convertidorFaC = (fahrenheit - 32)* 5/9;
       
        System.out.println("°C equivalen a "+convertidorCaF+ "°F");
        System.out.println("°F equivalen a "+convertidorFaC+ "°C");
    }
}
