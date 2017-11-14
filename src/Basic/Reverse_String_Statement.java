/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;


/**
 *
 * @author prudviraj
 */
public class Reverse_String_Statement {
    static StringBuffer s = new StringBuffer("noitisop 1 .on @ agruD si sihT");
    public static void main(String[] args) {
        System.out.println(s);
        int i=0;
        int j=s.length()-1;
        for(i=0; i<s.length(); i++){
         System.out.print(s.charAt(j));
         j--;
        }
        System.out.println("");
        
        
    }
}
