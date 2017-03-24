/*
 * Program:LinkedListTemplate
 * This:Node.java
 * Author:Nicholas Johnston
 * Date:3/27/2016
 * Purpose:To hold the element of the stack
 */
package linkedlisttemplate;

public class Node <T> 
{
    ///=========class memeber variables
    T element;
    Node next;
    //=========parameterized constructor
    public Node(T element)
    {
        this.element = element;
    }
    //=========methods
    String display()
    {
        String info = "" + element;
        return info;
    }
}
