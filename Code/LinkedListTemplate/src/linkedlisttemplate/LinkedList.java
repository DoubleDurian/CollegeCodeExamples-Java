/*
 * Program:LinkedListTemplate
 * This:LinkedList.java
 * Author:Nicholas Johnston
 * Date:3/27/2016
 * Purpose:To hold the nodes and manipulate them
 */
package linkedlisttemplate;


public class LinkedList <T> 
{
    // class variables
    Node first = null;
    // methods
    void insertFirst(T element)
    {//inserts a node at the head of the list
        Node insert = new Node(element);
        insert.next = first;
        first = insert;
    }
    Node deleteFirst()
    {//deletes and returns the node at the back of the list
        Node temp = first;//holds the node at the front of the stack
        first = first.next;//tells first to become the second
        return temp;//returns value that used to be first.
    }
    Node deleteLast()
    {//deletes the node at the back of the list
        Node temp;
        Node current = first;
        while(current.next != null)
        {
            current= current.next;
        }
        temp = current;
        current = null;
        return temp;
    }
           
    String displayList()
    {//converts the contents of the list into a formated String 
        String format = "";
        int position =1;
        Node current = first;
        while(current != null)
        {
            format = format+ position+":" + current.display() + "\n";
            position++;
            current = current.next;
        }
        return format;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public boolean search(T element)
    {
        Node current = first;
        while(current!=null)
        {
            if(current.element == element)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
