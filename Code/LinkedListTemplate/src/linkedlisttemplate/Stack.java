/*
 * Program:LinkedListTemplate
 * This:Stack.java
 * Author:Nicholas Johnston
 * Date:3/27/2016
 * Purpose:To use the LinkedList class like a stack object
 */
package linkedlisttemplate;


public class Stack<T> 
{
    LinkedList list = new LinkedList();
    
    public void push(T element)
    {
        list.insertFirst(element);
    }
    public Node pop()
    {
        Node temp = list.deleteFirst();
        System.out.println(temp.element + " was popped from the stack\n");
        return temp;
    }
    public void display()
    {
        System.out.println(list.displayList());
    }
    
}
