/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
1
121
12321
1234321
123454321
 
 * @author prudviraj
 */
public class Traingle 
{
    public static void main(String[] args) {
        int o=1;
        int oo = 2;
        for(int i=1; i<=5; i++){
            int k=0;
//            for(int j=1; j<=oo; j++){
//                System.out.print(" ");
//            }
            for(int j=1; j<=o; j++){
                if(j<=i){
                    k=k+1;
                }else{
                    k=k-1;
                }
                
                System.out.print(k);
            }
            System.out.println();
                o=o+2;
        } 
    }
   
}
