/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Prudvi
 */
public class Remove_Duplicates_In_String {
    public static void main(String[] args) {
        String x = "abbccddeffg";
        
        char [] a = x.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : a){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(Character chara : set){
            sb.append(chara);
        }
        System.out.println(sb.toString());
    }
}