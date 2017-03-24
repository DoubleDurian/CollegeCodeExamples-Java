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
public class BTSClass <T extends Comparable<T>>
        implements BSTInterface<T>
{
    protected BTSNode<T> root;// this is the start of the tree
    boolean found; //used to remove method
    
    protected LinkedUnboundedQueue<T> inOrderQueue;
    protected LinkedUnboundedQueue<T> preOrderQueue;
    protected LinkedUnboundedQueue<T> postOrderQueue;
    
}
