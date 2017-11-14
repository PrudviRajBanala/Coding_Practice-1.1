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
public class Missing_Number_In_10_Continuous_Number {
    public static void main(String[] args) {
        
        int n = 10;
        int c [] = {1,2,3,4,6,7,8,9,10};
        int b = n*(n+1)/2;
        int a = 0;
        for(int i=0; i<=c.length-1; i++){
            a = a + c[i];
        }
        System.out.println(b-a);
    }
    
}
