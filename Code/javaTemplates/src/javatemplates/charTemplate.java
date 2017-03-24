/*
 * Program:JavaTemplates
 * This:charTemplate.java
 * Author:DoubleDurian
 * Date:5/5/2016
 * Purpose:To generate an ascii table for the user to see first hand
 */
package javatemplates;

public class charTemplate 
{
    //variables
    char tempChar;
    
    //constructors
    charTemplate()
    {
        
    }
    //methods
    void printAscii()
    {
        for(int i = 0; i <128;i++)
        {
            if(i%5==0)
            {
                System.out.println();
            }
            tempChar = (char) i;
            System.out.print(i+":" +tempChar+" ");
            
        }
    }
    
}
