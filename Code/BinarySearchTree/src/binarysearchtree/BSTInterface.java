/*
 * Program:BinarySearchTree
 * This:BSTInterface.java
 * Author:Nicholas Johnston
 * Date:3/28/2016
 * Purpose:This is the tree object interface that the class implements
 */
package binarysearchtree;

public interface BSTInterface <T extends Comparable<T>>
{
    static final int INORDER = 1;
    static final int PREORDER = 1;
    static final int POSTORDER = 1;
    
    boolean isEmpty();
    
    int size();
    
    boolean conatains(T element);
    
    boolean remove(T element);
    
    T get(T element);
    
    void add(T element);
    
    void reset(int orderType);
    
    T getNext(int orderType);
        //Predcondition -is not empty
        // - has been reset for correct orderType
        // - has not been modified since reset
        // - end of iteration
    
}
