/*
 * Program:GenericStackDr
 * This: BoundedStackInterface.java
 * Date:2/12/2016
 * Author:Nicholas Johnston
 * Purpose:To contract the methods that a bounded stack will need
 */
package genericstackdr;

public interface BoundedStackInterface<T> extends StackInterface<T> 
{
    //===class variables========================================================
    //==class methods===========================================================
    void push(T element) throws StackOverflowException;
    // throws exception if this stack is full
    //otherwise place element at top
    
    boolean isFull();
    
    public void resize();
}