/*
 * Program:StringBag
 * This:Menu.java
 * Date:3/5/2016
 * Author:Nicholas Johnston
 * Purpose:Acts as a menu for the program and controls the StringList
 */
package stringbag;
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class Menu 
{//==========class variables
    Scanner scan = new Scanner(System.in);
    int choice;
    boolean shouldRun = true;
    String name;
    LinkedStringList myBag = new LinkedStringList("Bag");  
    String element;
    //=====parameterized class constructors 
    public Menu(String name)
    {
        this.name = name;
    }
    //=====class mathods
    public void run()
    {
        shouldRun = true;
        while(shouldRun)
        {
            printMenuOption();
            while(!scan.hasNextInt())
            {
                printMenuOption();
                scan.nextLine();
            }
            choice = scan.nextInt();
            action(choice);
            
        }
    }
    public void printMenuOption()
    {
        System.out.println("Please enter an integer relating to an option "
                + "listed below\n");
        System.out.println("1:Insert a string into the bag\n"
                + "2:clear the bag of contents\n"
                + "3:Display the contents of the bag\n"
                + "4:Exit the program");
    }
    public void action(int choice)
    {
        switch(choice)
        {
            case 1:
                System.out.println("You have chosen to Add another string to the bag");
                setElement();
                myBag.insert(element);
                break;
            case 2:
                System.out.println("You have chosen to empty the bag of its strings");
                myBag.clear();
                break;
            case 3:
                System.out.println("You have chosen to display the contents of this bag");
                System.out.println(myBag.toString());
                break;
            case 4:
                shouldRun = false;
                break;
        }
    }
    public void setElement()
    {
        System.out.println("\nPlease enter the String you wish to insert\n>");
        element = scan.next();
        
    }
    
}
