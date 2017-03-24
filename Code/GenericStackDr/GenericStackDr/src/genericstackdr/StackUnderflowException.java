/*
 * Program:GenericStackDr
 * This:StackUnderflowException.java
 * Date:2/12/2016
 * Author:Nicholas Johnston
 * Purpose:To throw an exception if the stack is empty
 */
package genericstackdr;


public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException()
    {
        super();
    }
    public StackUnderflowException(String message)
    {
        super(message);
    }
    
    
}