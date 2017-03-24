/*
 * Program:CarWashSimulator2016
 * This:Queue.java
 * Author:Nicholas Johnston
 * Date:3/29/2016
 * Purpose:To hold the number of cars in the car wash and to recieve commands 
           from the wash simulator
 */
package carwashsimulator2016;


public class Queue 
{
    //class variables
    Node first;//front of the line
    Node last;//back of the line
    int size = 0;//the size of the queue
    //constructors
    public Queue()
    {
        first = null;
        last = null;
        size = 0;
    }
    //methods
    public boolean isEmpty()
    {
        return(first ==null);
    }
    public int size()
    {
        return size;
    }
    public void enQueue(String message)
    {
        Node oldLast = last;
        last = new Node(message);
        last.next = null;
        if(isEmpty())
        {
            first = last;
        }
        else
        {
            oldLast.next = last;
        }
        size++;
          
    }
    public boolean deQueue()
    {
        if(isEmpty())
        {
            return false;
        }
        Node oldFirst = first;
        first = first.next;
        size--;
        if(isEmpty())
        {
            last = null;
        }
        return true;   
    }
   
    
}
