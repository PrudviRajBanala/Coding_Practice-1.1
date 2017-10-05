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
public class Reverse_String_Using_Recursion {
    String x = "";
    public String reverseString(String y){
        
        if(y.length() == 1){
            return y;
        }else{
            x += y.charAt(y.length()-1) + reverseString(y.substring(0, y.length()-1));
                    return x;

        }
        
    }
    public static void main(String[] args) {
        Reverse_String_Using_Recursion rs = new Reverse_String_Using_Recursion();
        System.out.println(rs.reverseString("Prudvi"));
    }
}
