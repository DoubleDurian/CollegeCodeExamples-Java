/*
 * Program:LinkedListTemplate
 * This:LinkedListTemplate.java
 * Author:Nicholas Johnston
 * Date:3/27/2016
 * Purpose:To serve as an example of a generic linked list stack
 */
package linkedlisttemplate;


public class LinkedListTemplate 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Stack myStack = new Stack();
        myStack.push(6);
        myStack.push('h');
        myStack.push("sjfjhl");
        myStack.push(999);
        myStack.display();
        myStack.pop();
        Queue myQueue = new Queue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.display();
        myQueue.deQueue();
        
    }
    
}
