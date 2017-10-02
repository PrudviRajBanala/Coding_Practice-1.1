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
public class B_Pair_Of_Array_Of_Size_n_Sum_Is_X_Method2 {
    
    
    static boolean addPair(){
        int [] A1 = {1,3,3,7,6,8};
            int inputNumber = 6;
            System.out.println(Arrays.toString(A1));
            Arrays.sort(A1);
            System.out.println(Arrays.toString(A1));
            int i = 0;
            int j = A1.length-1;
            while(i<j){
                if(A1[i]+A1[j] == inputNumber){
                    System.out.println(A1[i] + " + " + A1[j] + " = " + inputNumber);
                    i++;
                    j--;
                }
                else if(A1[i]+A1[j] < inputNumber){
                    i++;
                }
                else if(A1[i]+A1[j] > inputNumber){
                    j--;
                }
                
            } 
            return false;
            
    }
    
    
    public static void main(String[] args) {
            addPair();
            
    }
   
 
     
}
