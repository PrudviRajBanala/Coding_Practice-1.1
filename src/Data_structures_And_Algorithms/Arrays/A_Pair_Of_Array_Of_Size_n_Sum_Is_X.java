/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures_And_Algorithms.Arrays;


/**
 *
 * @author Prudvi
 */
public class A_Pair_Of_Array_Of_Size_n_Sum_Is_X {
    public static void main(String[] args) {
        int X = 11;
        int [] a = {2,5,7,4,8};        
        
        
        /*
        Method 1
        Using nested for loop
        Time complexity O(n^2)
        */
        for (int d = 0; d<a.length; d++){
            for(int e = d+1; e<a.length; e++){
                if(a[d]+a[e] == X){
                    System.out.println(a[d] + " + " + a[e] + " = " + X);   
                }
            }
        }    
    }
    
    /*
        Method 2
        Using Sorting
        */
      
}
