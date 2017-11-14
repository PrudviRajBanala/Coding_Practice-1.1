/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author prudviraj
 */
public class Ocurrance_Of_Character_In_String {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println("Enter Character");
        char ch = (char) System.in.read();
        
        int j = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==ch){
                j++;
            }
        }
        System.out.println(j);
    }
    
    
}
