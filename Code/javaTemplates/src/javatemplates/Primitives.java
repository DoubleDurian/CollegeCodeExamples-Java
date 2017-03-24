/*
 * Program:JavaTemplates
 * This:Primmitives.java
 * Author:DoubleDurian
 * Date:5/4/2016
 * Purpose:To demonstrate the declaration and limtis of the primitive data types
 */
package javatemplates;
import java.util.Scanner;
/*
I'm not certain how nessisary this template is. I mean it is aa functioning 
class file that creates a working object, maybe i should just build a calculator

hey that's a pretty good idea

thanks me
*/

public class Primitives 
{
    //-----------------------------variables------------------------
    Scanner scan = new Scanner(System.in);
    int a,b;
    int choice =0;
    //----------------------------constructor-----------------------
    public Primitives()
    {
        
    }
    //------------------------------Methods---------------------------
    int add(int alpha, int beta)
    {
        return alpha + beta;
    }
    int subtract(int alpha, int beta)
    {
        return alpha - beta;
    }
    int divide(int alpha, int beta)
    {
        if(beta ==0)
        {
            return 0;
        }
        return alpha / beta;
    }
    int multiply(int alpha, int beta)
    {
        return alpha * beta;
    }
    int modulo(int alpha , int beta)
    {
        return alpha%beta;
    }
    int getInput(int subject)
    {//ensures that the input is a number
        
        while(!scan.hasNextInt())
        {
            System.out.println("That's not a correct number you dumbass!\nTRY AGAIN!!");
            scan.nextLine();
        }
        subject = scan.nextInt();
        return subject;
    }
    void menu()
    {
        System.out.println("Hello, this operation is meant to test the nature of"
                + " primitives and perform math in conjunction with user input\n"
                + "[1]:add(a,b)"
                + "\n[2]:subtract(a,b)"
                + "\n[3]:divide(a,b)"
                + "\n[4]:multiply(a,b)"
                + "\n[5]:modulo(a,b)"
                + "\n\nPlease enter a number matching an option above");
        choice = getInput(choice);
        while(choice>5||choice<1)
        {//ensure the input is between 5 and 1 inclusive
            System.out.println("That was a number, but not within the range of "
                    + "what i was looking for...\nwhy must you dissapoint me so");
            getInput(choice);
        }
        System.out.println("Shine on you crazy diamond\nWhat two numbers have "
                + "we selected for today's math demo\nRemember, one at a time "
                + "thank you very much");
       
        a =  getInput(a);
        b = getInput(b);
        
        switch(choice)
        {
            case 1:
                System.out.println("The answer to " +a+" plus "+b+" is "+add(a,b));
                break;
            case 2:
                System.out.println("The answer to " +a+" minus "+b+" is "+subtract(a,b));
                break;
            case 3:
                System.out.println("The answer to " +a+" over "+b+" is "+divide(a,b));
                break;
            case 4:
                System.out.println("The answer to " +a+" times "+b+" is "+multiply(a,b));
                break;
            case 5:
                System.out.println("The answer to " +a+" mod "+b+" is "+modulo(a,b));
                break;
            default:
                break;
        }
        
        
    }
    
    
    
}
