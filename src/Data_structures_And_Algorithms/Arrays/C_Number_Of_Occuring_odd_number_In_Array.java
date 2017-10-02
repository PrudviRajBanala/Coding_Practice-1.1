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
public class C_Number_Of_Occuring_odd_number_In_Array {
    
    static int getOddNumbers(int [] array, int arry_size){
        
        for(int i=0; i<array.length; i++){
            int x = 0;
            for(int j=0; j<array.length; j++){
                if(array[i] == array[j])
                    x++;
                    }
            if(x%2 != 0){
                return array[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddNumbers(arr, n));
    }
}
