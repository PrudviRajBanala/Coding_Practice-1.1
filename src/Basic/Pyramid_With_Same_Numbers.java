/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author prudviraj
 */

/**
   1 
  2 2 
 3 3 3 
4 4 4 4 
 */
public class Pyramid_With_Same_Numbers {
    public static void main(String[] args) {
        
        int o = 1;
        int os = 3;
        for(int i=1; i<=4; i++){
            for(int j=os; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
            o=o+2;
            os = os-1;
        }
    }
    
}
