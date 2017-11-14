package Data_structures_And_Algorithms.Sorting_Algorithm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudviraj
 */
public class BubbleSorting_Ascendingorde {
        public static void main(String[] args) {
        int [] input = {2,6,4,3,5,76,43,73};
        bubble_Sorting(input);
        for(int i = 0; i < input.length; i++)
        {
            System.out.print(input[i]+", ");
        }
    }
    public static void bubble_Sorting(int ar[]){
        for(int i=0; i<ar.length-1; i++){
            for(int j=1; j<ar.length-i;  j++){
                if(ar[j-1] > ar[j]){
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}
