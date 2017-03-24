/*
 * Program:PresidentArrayQueue
 * This:PresidentArrayQueue
 * Author:Nicholas Johnston
 * Date:3/25/2016
 * Purpose:This array queue holds a an object called a president
 */
package presidentarrayqueue;


public class PresidentArrayQueue 
{
    public static void main(String[] args) 
    {
        //add potus objects to array queue
        
        POTUSArray array = new POTUSArray();
        POTUS lincoln = new POTUS(16,"Abraham Linoln","Illinois","Republican",
                "Febuary 12th, 1809","March 4th 1861");
        POTUS obama = new POTUS(44,"Barack Obama","Illinois","Democrat",
                "August 4th 1961","January 20th 2009");
        POTUS washington = new POTUS(1,"George Washington","Washington","Independent",
                "Febuary 22nd, 1732","April 30th 1789");
        array.enQueue(lincoln);
        array.enQueue(obama);
        array.enQueue(washington);
        
        //testing the search functions
        array.searchName("Bob");
        array.searchName("Abraham Linoln");
        array.searchNumber(44);
        array.searchNumber(1);
    }  
}
