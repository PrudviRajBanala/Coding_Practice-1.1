/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Arrays;

/**
 *
 * @author prudviraj
 */

/**
   1
  123
 12345
1234567
 */
public class Pyramid {
    public static void main(String[] args) {
           int o = 1;
           int os = 3;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=os; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=o; j++){
                System.out.print(j);
            }
            System.out.println();
            o = o+2;
            os = os-1;
        }
        
    }
    
}
