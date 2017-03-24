/*
 * Program:PresidentArrayQueue
 * This:POTUSArray.java
 * Author:Nicholas Johnston
 * Date:3/25/2016
 * Purpose:To create a queueu of president objects
 */
package presidentarrayqueue;

public class POTUSArray 
{
    //class variables
    protected final int DEFCAP = 100;
    public POTUS[] queue;
    public int front = -1;
    public int back= -1;
    public int size;
    POTUS searcher;
    //constructors
    public POTUSArray()
    {//default contstructor 
        size = DEFCAP;
        queue = (POTUS[]) new POTUS[DEFCAP];
    }
    public POTUSArray(int maxSize)
    {//parameterized constructor
        size = maxSize;
        queue = (POTUS[]) new POTUS[maxSize];
    }
    //class methods
    //void push
    public boolean isEmpty()
    {//chacks if the queue is empty
         return (front == -1 && back == -1);
    }
    public void enQueue(POTUS president)
    {//adds a POTUS object to the queue
        if ((back+1)%size==front) {
            throw new IllegalStateException("Queue is full");
        }else if(isEmpty())
        {
            front++;
            back++;
            queue[back] = president;
            
        }else
        {
            back=(back+1)%size;
            queue[back] = president;
        }
    }
    public POTUS deQueue()
    {//removes the front POTUS from the queue
        POTUS president = null;
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, cant dequeue");
        } else if (front == back) {
            president = queue[front];
            front = -1;
            back = -1;

        } else {
            president = queue[front];
            front=(front+1)%size;

        }
        return president;
    }
    public boolean searchNumber(int number)
    {//searches the queue for a POTUS object with a matching number as the search
        //item
        
        for(int i =0; i < queue.length;i++)
        {
            searcher = queue[i];
            if(searcher.getNumber() == number)
            {
                System.out.println("There is a president numbered " + number);
                System.out.println(displaySearch()+"\n\n");
                return true;
            }
        }
        System.out.println("Queue does not contain president number " + number + "\n\n");
        return false;
    }
    public boolean searchName(String name)
    {//searches the queue for a POTUS object with a matching name to the search
        //item
        String nameOf;
        for(int i = 0; i < back;i++)
        {
            searcher = queue[i];
            nameOf = searcher.getName();
            if(name.equalsIgnoreCase(nameOf))
            {
                System.out.println("There is a president named " + name);
                System.out.println(displaySearch()+"\n\n");
                return true;
            }
        }
        System.out.println("This Queue does not contain a president named " + name + "\n\n");
        return false;
    }
    public String displaySearch()
    {//Formats the result of the user's search
        String format = "Name:" + searcher.getName()+"\nState:"
                +searcher.getState()+ "\nParty:" + searcher.getParty()+"\nDate of Birth:"
                +searcher.getDOB() + "\nDate of Inauguration:" + searcher.getDOI();
        return format;
    }
    
    
}
