/*
 * Program:StringBag
 * This:StringBag.java
 * Date:3/4/2016
 * Author:Nicholas Johnston
 * Purpose:To hold a series of Strings in a bag and to display them if need
           be. 
 */
package stringbag;
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class StringBag {
    

    public static void main(String[] args) 
    {
        /*
        LinkedStringList myBag = new LinkedStringList("Bag");
        myBag.insert("One");
        myBag.insert("Two");
        myBag.insert("Three");
        myBag.insert("Four");
        myBag.insert("Five");
        System.out.println(myBag.toString());
        System.out.println(myBag.size());
        */
        String name = "MyBag";
        Menu menu = new Menu(name);
        menu.run();

        
       
    }
    
}
