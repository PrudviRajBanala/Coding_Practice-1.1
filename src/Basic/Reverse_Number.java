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
public class Reverse_Number {
    public int reverseNumber(int x){
        int a = 0;
        while(x!=0){
            a = (a*10) + (x%10);
            x = x/10;
        }
        return a;
    }
    public static void main(String[] args) {
        Reverse_Number rn = new Reverse_Number();
        System.out.println(rn.reverseNumber(125));
    }
}
