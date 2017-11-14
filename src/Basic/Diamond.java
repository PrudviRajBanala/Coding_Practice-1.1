/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author prudviraj
 */

/**
  1
 212
32123
 212
  1
 */
public class Diamond {
    public static void main(String[] args) {
        int o=1;
        int oo = 2;
        int start = 0;
        for(int i=1; i<=5; i++){
            if(i<3){
                start = i;
            }else{
                start = 6-i;
            }
            for (int j=1; j<=oo; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=o; j++){
                int middleColumn = o/2+1;
                System.out.print(start);
                if(j<middleColumn){
                    start--;
                }else{
                    start++;
                }
            }
            System.out.println();
            if(i<3){
            o = o+2;
            oo= oo-1;
            }else{
                o = o-2;
                oo=oo+1;
            }
        }
    }
}
