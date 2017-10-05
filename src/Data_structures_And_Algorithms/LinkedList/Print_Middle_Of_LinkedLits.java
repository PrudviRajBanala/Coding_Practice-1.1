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
public class Print_Middle_Of_LinkedLits {
    public static void main(String[] args) {
        List<Integer> x = new LinkedList<Integer>();
        x.add(1);
        x.add(2);
        x.add(1);
        x.add(3);
        x.add(4);
        int y = (x.size()/2);
        System.out.println(x);
        System.out.println(x.get(y));
        
        
    }
}
