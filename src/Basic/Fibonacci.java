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
public class Fibonacci {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 0;
        a[1] = 1;
        for(int i=2; i<a.length; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int j = 0; j<a.length; j++){
            System.out.println(a[j]);
        }
    }
}
