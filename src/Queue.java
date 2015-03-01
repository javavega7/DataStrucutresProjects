/**
 * 
 * @author javier vega
 * 
 * Data Structures Project 1
 * @Stockton University
 * 
 * 
 *Class Queue<E> implements a Queue through a LinkedList
  **/
import java.util.LinkedList;

public class Queue<E>{
    
    
    private final LinkedList<E> myQueue = new LinkedList<E>();
    
    /*
    *queue methods
    */
    
    //places the object to the rear of the queue
    public void offer(E item){
        myQueue.add(item);
    }
    
    //removes the object at the front of the queue
    public E poll(){  
        return myQueue.removeFirst();
    }
   
    //return the entry at the front of the queue
    public E peek(){
        return myQueue.peekFirst();
    }
   
    //returns true if there are entries in the queue
    public boolean hasItems() {
      return !myQueue.isEmpty();
   }
   
    //returns the size of the queue
    public int getSize() {
      return myQueue.size();
   }
   
   //returns true if the queue is empty.
   public boolean isEmpty(E item){       
        return myQueue.isEmpty();
   }
}