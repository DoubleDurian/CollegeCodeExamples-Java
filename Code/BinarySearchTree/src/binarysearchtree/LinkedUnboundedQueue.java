/*
 * Program:
 * This:
 * Author:
 * Date:
 * Purpose:
 */
package binarysearchtree;

/**
 *
 * @author thedo
 */
public class LinkedUnboundedQueue <T> implements UnboundedQueueInterface<T>
{
    protected LLNode<T> front;
    protected LLNode<T> rear;
    
    public LinkedUnboundedQueue()
    {
        front = null;
        rear = null;
    }
    public void enqueue(T element)
    {
        LLNode<T> newNode = new LLNode<T> (element);
        if(rear == null)
        {
            front = newNode;
        }
        else
        {
            rear.setLink(newNode);
            rear = newNode;
        }
    }
    public T dequeue()
    {
        if(isEmpty())
        {
            throw new QueueuUnderflowException("cant mnag nsorry");
        }
        else
        {
            T element;
            element = front.getInfo();
            front = front.getLink();
        }
        
    }
    public boolean isEmpty()
    {
        if(front == null)
        {
            return true;
        }
        return false;
    }
}
