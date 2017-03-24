/*
 * Program:StringBag
 * This:LinkedStringList.java
 * Date:3/4/2016
 * Author:Nicholas Johnston
 * Purpose:This object conatines a series of Nodes that each hold a string
 */
package stringbag;
/**
 *
 * @author Nick
 */
public class LinkedStringList 
{
    //================class variables=======================
    Node first = null;
    String nameOfThisBag;
    int length =0;
    //================class constructor==================
    public LinkedStringList(String name)
    {
        this.nameOfThisBag = name;
    }
    //================class methods=======================
    public void insert(String element)
    {
        Node newNode = new Node(element);
        newNode.next = first;
        first = newNode;    
        length++;
    }
    public boolean isFull()
    {
        return false;
    }
    public int size()
    {
        Node current = first;
        int size=1;
        while(current.next != null)
        {
            size++;
            current = current.next;
        }
        return size;
    }
    public void clear()
    {
        while(first.next!=null)
        {
            first = first.next;
        }
        first = null;
        length =0;
    }
    public String getName()      
    {
        return this.nameOfThisBag;
    }
    public String toString()
    {
        String bagString = "The Name of the Bag is " + this.nameOfThisBag+"\n";
        Node current = first;
        
        for(int i = 0; i<length;i++)
        {
            bagString = bagString + ">" + current.displayNode()+"\n";
            current = current.next;
        }
        return bagString;
    }
}
