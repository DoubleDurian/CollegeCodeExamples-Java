/*
 * Program:FatStacks
 * This StackInterface.java
 * Date:2/10/2016
 * Author:Nicholas Johnston
 * Purpose:contract for the methods of an unbounded stack class
 */
package genericstackdr;

/**
 *
 * @author Nick
 */
public interface StackInterface<T> 
{
    void pop() throws StackUnderflowException;
    //throws exception if the stack is empty
    //otherwise remove top element 
    
    T top() throws StackUnderflowException;
    //throws exception if the stack is empty 
    //otherwise returns the top element 
    
    boolean isEmpty();
    //returns true if stack is empty
    
    
    
    
}