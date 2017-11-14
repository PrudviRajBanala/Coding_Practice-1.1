/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures_And_Algorithms.LinkedList;


/**
 *
 * @author Prudvi
 */
public class Reverse_Of_SingleLinkedList {
    
    
    public void display(Node node){
        while(node!= null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public Node reverse(Node node){
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    
    
    public static void main(String[] args) {
      
        Reverse_Of_SingleLinkedList rs = new Reverse_Of_SingleLinkedList();
        rs.head = new Node(85);
        rs.head.next = new Node(84);
        rs.head.next.next = new Node(83);
        rs.head.next.next.next = new Node(82);
        System.out.println("before reverse");
        rs.display(head);
        head = rs.reverse(head);
        System.out.println("");
        System.out.println("after reverse");
        rs.display(head);
    
        
        
    }
    
    
}
