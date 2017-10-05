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
public class Singleton_Class_Easy_Instantiation {
    static Singleton_Class_Easy_Instantiation x = new Singleton_Class_Easy_Instantiation();
    
    private Singleton_Class_Easy_Instantiation(){
        System.out.println("Instance created");
    }
    
    public static Singleton_Class_Easy_Instantiation show(){
        return x;
    }
    public static void main(String[] args) {
        
        Singleton_Class_Easy_Instantiation sc = Singleton_Class_Easy_Instantiation.show();
    }
    
}
