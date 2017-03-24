/*
 * Program:PostFixDriver
 * This:Stack.java
 * Author:Nicholas Johnston
 * Date:4/2/2016
 * Purpose:This stack holds the elements of the string in char format
 */
package postfixdriver;

/**
 *
 * @author thedo
 */
public class Stack 
{
    //class variables
    private int maxSize;
    private char[] stackArray;
    private int top;
    //constructors
    public Stack(int maxSize)
    {
        this.maxSize = maxSize;
        stackArray = new char[this.maxSize];
        top = -1;
    }
    //methods
    public void push(char operator)
    {
        top++;
        stackArray[top] = operator;
    }
    public char pop()
    {
        return stackArray[top--];
    }
    public char peek()
    {
        return stackArray[top];
    }
    public boolean isEmpty()
    {
        return (top ==-1);
    }
    
    
}
