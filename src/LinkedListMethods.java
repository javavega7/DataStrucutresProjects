/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javier
 */


import java.util.LinkedList;

public class LinkedListMethods<E>{
    
     LinkedList<E> myList = new LinkedList<E>();
    
    public void addFirst(E item){
        
        myList.addFirst(item);
    
    }
    
    public void addLast(E item){
    
        myList.addLast(item);
    }
            
            
    public E removeFirst(){
        
        return myList.removeFirst();
    
    }
   
    public E removeLast(){
        
        return myList.removeLast();
    
    }
    
    public String printAll(){
    
        return myList.toString();
    }
    
    
    
   public static void main(String[] args) {
       
        LinkedListMethods <String> mylist = new LinkedListMethods<String>();
               
        mylist.addFirst("Abby");
        mylist.addFirst("Adam");
        mylist.addLast("Betty");
        mylist.addLast("Cathy");
        mylist.addLast("Daisy");
        
        System.out.println(mylist.printAll());  
        
        mylist.removeFirst();
        
        System.out.println(mylist.printAll());
        
        mylist.removeLast();
        
        
        System.out.println(mylist.printAll()); 
        
        System.out.println("===== Well Done ====");

        System.out.println(mylist.printAll());
         
    
    }

}