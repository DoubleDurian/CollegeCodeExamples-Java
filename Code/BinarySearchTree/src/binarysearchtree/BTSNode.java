/*
 * Program:Binary search tree
 * This:BTSNode.java
 * Author:Nicholas Johnston
 * Date:3/28/2016
 * Purpose:Implements combarable Nodes for a BTS
 */
package binarysearchtree;

public class BTSNode <T extends Comparable<T>>
{
    protected T info;
    protected BTSNode <T> left;
    protected BTSNode <T> right;
    
    //=================constructor()===============//
    
    public BTSNode(T info)
    {
        this.info = info;
        left = null;
        right = null;
    }
    //===============

    public T getInfo() 
    {
        return info;
    }

    public void setInfo(T info) 
    {
        this.info = info;
    }

    public BTSNode<T> getLeft() 
    {
        return left;
    }

    public void setLeft(BTSNode<T> left) 
    {
        this.left = left;
    }

    public BTSNode<T> getRight() 
    {
        return right;
    }

    public void setRight(BTSNode<T> right) 
    {
        this.right = right;
    }
    
}
