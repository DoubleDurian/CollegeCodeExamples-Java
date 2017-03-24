/*
 * Program:StringBag
 * This:Node.java
 * Date:3/4/2016
 * Author:Nicholas Johnston
 * Purpose:The Node contains a String named element and a Node refference to the
            next Node.
 */
package stringbag;

/**
 *
 * @author Nick
 */
public class Node 
{//============class variables=============
    String element;
    Node next = null;
    //=========parameterized constructor=======
    public Node(String element)
    {
        this.element = element;
    }
    public String displayNode()
    {
        return this.element;
    }
    
}
