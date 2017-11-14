/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures_And_Algorithms.Sorting_Algorithm;

/**
 *
 * @author prudviraj
 */
public class BubbleSorting_descendingOrder {
    public static void main(String args []){
    int[] input={6,8,4,12,15};
    sortDes(input);
    for (int i=0; i<input.length; i++){
        System.out.print(input[i] + " ");
    }
}
    static void sortDes(int[]args)
    {
        for (int i=0; i<args.length;i++){
        for(int j=1;j<args.length;j++){
            if(args[j-1] < args[j]){
                int t=args[j-1];
                args[j-1]=args[j];
                args[j]=t;
                }
            }
        }
    }
}
