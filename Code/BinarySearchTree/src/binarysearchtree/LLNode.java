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
public class LLNode <T>
{
    private LLNode<T> link;
    private T info;
    
    public LLNode(T info)
    {
        this.info = info;
        link = null;
    }

    public LLNode<T> getLink() {
        return link;
    }

    public void setLink(LLNode<T> link) {
        this.link = link;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    
}
