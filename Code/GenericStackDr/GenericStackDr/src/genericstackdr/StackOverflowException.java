/*
 * Program: GenericStackDr
 * This:StackOverfloException.java
 * Date:2/12/2016
 * Author:Nicholas Johnston
 * Purpose:To throw an exception if the stack is too high
 */
package genericstackdr;


public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        super();
    }
    public StackOverflowException(String message)
    {
        super(message);
    }   
}
