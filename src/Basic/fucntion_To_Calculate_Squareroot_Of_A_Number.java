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
public class fucntion_To_Calculate_Squareroot_Of_A_Number {
    public static void main(String[] args) {
        double a = 36;
        findSquare(a);
    }
    public static void findSquare(double number){
        boolean ispositive = true;
        double g1;
        
        double squareroot = number/2;
        do{
            g1 = squareroot;
            squareroot = (g1+(number/g1))/2;
        }while(g1-squareroot !=0);
        
        if(ispositive){
            System.out.println("+ " + squareroot);
            System.out.println("+ " + squareroot);
        }else{
            System.out.println("+ " + squareroot);
            System.out.println("+ " + squareroot);
        }
        
    }
}
