/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures_And_Algorithms.ArrayList;

import java.util.Arrays;

/**
 *
 * @author Prudvi
 */
public class Implement_ArrayList {
 
    private Object [] myStore;
    private int actsize = 0;
    
    public Implement_ArrayList(){
        myStore = new Object[10];
    }
    
    public Object get(int index){
        if(index<actsize){
            return myStore[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public void add(Object obj){
        if(myStore.length-actsize<=5){
           increaseListSize();
        }
        myStore[actsize++] = obj;
    }
    
    public void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("new length: " + myStore.length);
    }
    
    public int size(){
        return actsize;
    }
    
    public static void main(String[] args) {
        Implement_ArrayList ia = new Implement_ArrayList();
        ia.add(new Integer(2));
        ia.add(new Integer(3));
        ia.add(new Integer(4));
        ia.add(new Integer(5));
        ia.add(new Integer(6));
        ia.add(new Integer(7));
        for(int i=0; i<ia.size(); i++){
            System.out.print(ia.get(i)+ " ");
        }
        
        System.out.println(ia.get(4));
        
    }
}
