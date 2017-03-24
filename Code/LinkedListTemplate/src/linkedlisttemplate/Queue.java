/*
 * Program:LinkedListTemplate
 * This:Queue.java
 * Author:Nicholas Johnston
 * Date:3/27/2016
 * Purpose:This is a linked queue list. 
 */
package linkedlisttemplate;

/**
 *
 * @author thedo
 */
public class Queue<T>
{
    LinkedList list = new LinkedList();
    
    public void enQueue(T element)
    {
        list.insertFirst(element);
    }
    public Node deQueue()
    {
        Node temp = list.deleteLast();
        System.out.println(temp.element + " was deQueued from the list\n");
        return temp;
    }
    public void display()
    {
        System.out.println(list.displayList());
    }
    
}
