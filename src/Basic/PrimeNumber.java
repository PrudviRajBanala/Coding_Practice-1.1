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
public class PrimeNumber {
    
    public boolean checkprimeNumber(int x){
        boolean isPrime = true;
        for(int i = 2; i<x; i++){
            if(x%i==0){
                isPrime = false;
            }
        }
//        if(isPrime){
//            System.out.println(x +" is prime");
//        }else{
//            System.out.println(x+" is not prime");
//        }
        return isPrime;
    }
    
    
    public static void main(String[] args) {
PrimeNumber pn = new PrimeNumber();
        System.out.println(pn.checkprimeNumber(18));        
    }
}
