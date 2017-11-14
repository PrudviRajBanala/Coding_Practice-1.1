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
public class Search_Element_In_Sorted_Array {
    
    public int searchElement(int [] inputArray, int key){
        
       int start = 0;
       int end = inputArray.length-1;
       
       while(start <=end){
           int mid = (start + end)/2;          
           if(key == inputArray[mid]){
               return mid;
           }else if(key < inputArray[mid]){
               end = mid-1;
           }else{
               start = mid+1;
               
           }
       }
        
    return -1;
    }
    
    
    public static void main(String[] args) {
    Search_Element_In_Sorted_Array sc = new Search_Element_In_Sorted_Array();
    int [] array = {2,4,6,8,10, 12, 14, 16};
        System.out.println(sc.searchElement(array, 14));
    }
}
