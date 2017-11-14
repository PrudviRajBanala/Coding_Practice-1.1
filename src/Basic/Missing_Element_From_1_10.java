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
public class Missing_Element_From_1_10 {
    public static void main(String[] args) {
        int sum = 0;
        int [] a = {1,2,3,4,5,7,8,9,6};
        int total = 10*(10+1)/2;
        for(int i=0; i<9; i++){
           sum = sum + a[i];
        }
        System.out.println(total - sum);
    }
}
