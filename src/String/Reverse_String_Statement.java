/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;



/**
 *
 * @author Prudvi
 */
public class Reverse_String_Statement {
    public static void main(String[] args) {
        /*
        input "You are how"
        ------------------
        output "how are you"
        */
        String z = "You are how";
        System.out.println(z);
        String [] a = z.split(" ");
        for(int i =a.length-1; i>=0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        
        /*
        input "uoy era woh"
        ------------------
        output "how are you"
        */
        String x = "uoy era woh";
        System.out.println(x);
        int j = x.length()-1;
        for(int y=0; y<x.length(); y++ ){
            System.out.print( x.charAt(j));
            j--;
        }
        System.out.println("");
    }
}
