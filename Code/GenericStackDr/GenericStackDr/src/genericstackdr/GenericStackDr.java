/*
 * Program:GenericStackDr
 * This GenericStackDr.java
 * Date:2/12/2016
 * Author:Nicholas Johnston
 * Purpose:To create a stack that doubles in size when full
 */
package genericstackdr;
import java.util.Scanner;

public class GenericStackDr {


    public static void main(String[] args) 
    {
        //============main variables============================
        Scanner scan = new Scanner(System.in);
   
        ArrayStack<String>stack = new ArrayStack<>(4);
        String line =  "";
        //=======================================================
        for(int index = 0; index <=4;index++)
        {//asks the user to input elements into a stack
            if(stack.isFull())
            {//if the stack is already full the resize method will double the 
                //number of available stack elements
                stack.resize();
            }
        System.out.println("Enter a line of text:>");
        line = scan.nextLine();
        stack.push(line);
        }
        System.out.println("\nReverse is:\n");
        while(!stack.isEmpty())
        {//This reprints the elements in the stack using the top and pop methods
            line = stack.top();
            stack.pop();
            System.out.println(line);
        }
        
    }
    
}
