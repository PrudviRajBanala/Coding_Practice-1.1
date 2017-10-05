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
public class Singleton_Class_Lazy_Instantiation {
    
    static Singleton_Class_Lazy_Instantiation x;
    
    private Singleton_Class_Lazy_Instantiation(){
        System.out.println("instance created");
    }
    
    static Singleton_Class_Lazy_Instantiation show(){
        if(x==null){
            x = new Singleton_Class_Lazy_Instantiation();
        }
        return x;
    }
    public static void main(String[] args) {
        Singleton_Class_Lazy_Instantiation sc = Singleton_Class_Lazy_Instantiation.show();
        Singleton_Class_Lazy_Instantiation sc1 = Singleton_Class_Lazy_Instantiation.show();
    }
}
