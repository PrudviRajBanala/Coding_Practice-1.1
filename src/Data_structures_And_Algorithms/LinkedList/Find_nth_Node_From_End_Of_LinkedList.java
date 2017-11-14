/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures_And_Algorithms.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Prudvi
 */
public class Find_nth_Node_From_End_Of_LinkedList {
    public static void main(String[] args) {
        int n = 9;
        List<Integer> x = new LinkedList<Integer>();
        x.add(1);
        x.add(2);
        x.add(1);
        x.add(3);
        x.add(4);
        x.add(6);
        x.add(3);
        x.add(4);
        x.add(6);
        int y = (x.size()-n);
        System.out.println(x);
        System.out.println(x.size());
        System.out.println(y);
        System.out.println(x.get(y));
        
    }
}
