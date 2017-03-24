/*
 * Program:GenericStackDr
 * This: ArrayStack.java
 * Date:2/12/2016
 * Author:Nicholas Johnston
 * Purpose:To hold elements within this stack and to double itseld if overflown
 */
package genericstackdr;

/**
 *
 * @author Nick
 */
public class ArrayStack<T> implements BoundedStackInterface<T> 
{
    //===============class variables==================================
    protected final int DEFCAP = 100;//default cap on the stack size
    public T[] stack;//holds stack elements
    public int topIndex = -1;//index of the top of array
    //public int front = 0;
    
    //=============constructors=========================================
    public ArrayStack()
    {
        stack = (T[]) new Object[DEFCAP];
    }
    public ArrayStack(int maxSize)
    {
        stack = (T[]) new Object[maxSize];
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //================class methods===================================
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //===============void push=============================================
    public void push(T element)
    {//throws StackOverflowException if stack object is already full
     //otherwise places element at top position in stack
        if(!isFull())
        {
            topIndex++;
            stack[topIndex] = element;
        }
        else
        {
            throw new StackOverflowException("This stack is waaaaay too phat");
        }
    }
    //====================void pop()===========================================
    public void pop()
    {//throws exception if this stack if empty 
     // otherwise remove top element and return it
        if(!isEmpty())
        {
            stack[topIndex] = null;
            topIndex--;
            //System.out.println("Top index is "+topIndex);
        }
        else
        {
            throw new StackUnderflowException("Your stack has no more phat for dat");
        }
        
    }
    public T top()
    {//throw exception if dat stack empty
        T topOfStack = null;
        if(!isEmpty())
        {
            topOfStack = stack[topIndex];
        }
        else
        {
            throw new StackUnderflowException("Your stack is full on slack");
        }
        return topOfStack;
    }
    //=============boolean isEmpty()=====================================
    public boolean isEmpty()
    {
        if(topIndex == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFull()
    {
        if(topIndex == (stack.length -1))
        {
            
            return true;
        }
        else
        {
            return false;
        }
    }
    public void resize()
    {   //This method doubles the number of elements in an array without
        //changing the order of those elements
        //creates a new generic array to copy information from the existing 
        //array
        T[] otherStack = (T[]) new Object[stack.length*2];
        this.topIndex = -1;
        for(int i=0;i<this.stack.length;i++)
        {
            otherStack[i]= this.stack[i];
            this.topIndex++;
            //System.out.println("Temporary Stack Element:"+otherStack[i]+ " Number:"+ i);
            //The above line is used in debuggin to check that elements are copying
        }
        this.stack = otherStack.clone();
        
        System.out.println("Copying to original stack\n Original stack length is now " + this.stack.length);
        for(int i = 0; i<this.stack.length;i++)
        {
            System.out.println("Stack Element:"+this.stack[i]+ " Number:"+ i);
        }
        
    }
        
    
}

