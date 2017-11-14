/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Prudvi
 */
public class Find_Duplicate_From_1_N {
    public static void main(String[] args) {
       int sum = 0;
        int n=4;
        int [] a = {1,2,3,3,4};
        int b = (n*(n+1))/2;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum - b);
    }
}
