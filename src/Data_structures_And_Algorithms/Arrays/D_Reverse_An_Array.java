/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures_And_Algorithms.Arrays;

import java.util.Arrays;

/**
 *
 * @author Prudvi
 */
public class D_Reverse_An_Array {
    public static void main(String[] args) {
       int temp;
        int x [] = {1,2,3,4,5,6};
        int j = x.length-1;
        for(int i = 0; i<x.length/2; i++){
            temp = x[i];
            x[i] = x[j-i];
            x[j-i] = temp;
        }
        System.out.println(Arrays.toString(x));
    }
}
