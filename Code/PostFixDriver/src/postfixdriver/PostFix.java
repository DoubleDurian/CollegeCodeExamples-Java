/*
 * Program:PostFixDriver
 * This:PostFix.java
 * Author:Nicholas Johnston
 * Date:4/2/2016
 * Purpose:This turns the contents of the stack into post fix
 */
package postfixdriver;


public class PostFix 
{
    //class variables
    private Stack myStack;
    private String input;
    private String output ="";
    //class constructor
    public PostFix(String in)
    {
        input = in;
        int stackSize = input.length();
        myStack = new Stack(stackSize);
    }
    //class methods
    public String convert()
    {
        for(int i =0;i<input.length();i++)
        {
            char character = input.charAt(i);
            switch(character)
            {
                case '+':
                case '-':
                operand(character,1);
                break;
                case '*':
                case '/':
                operand(character,2);
                break;
                case '(':
                myStack.push(character);
                break;
                case ')':
                parenthesis(character);
                break;
                default:
                output = output + character;    
            }
        }
        while(!myStack.isEmpty())
        {
            output = output + myStack.pop();
        }
        System.out.println(output);
        return output;
    }
    public void operand(char operand, int condition)
    {
        while(!myStack.isEmpty())
        {
            char opTop = myStack.pop();
            if(opTop =='(')
            {
                myStack.push(opTop);
                break;
            }
            else
            {
                int condition2;
                if(opTop == '+'||opTop == '-')
                {
                    condition2 = 1;
                    
                }
                else
                {
                    condition2 = 2;
                }
                if(condition2 < condition)
                {
                    myStack.push(opTop);
                    break;
                }
                else
                {
                    output = output + opTop;
                }
            }
            
        }
        myStack.push(operand);
    }
    public void parenthesis(char character)
    {
        while(!myStack.isEmpty())
        {
            char temp = myStack.pop();
            if(character == '(')
            {
                break;
            }
            else
            {
                output = output + temp;
            }
        }
    }
}
