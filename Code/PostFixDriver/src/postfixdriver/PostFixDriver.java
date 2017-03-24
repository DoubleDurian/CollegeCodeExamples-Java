/*
 * Program:PostFixDriver
 * This:PostFixDriver.java
 * Author:Nicholas Johnston
 * Date:4/2/2016
 * Purpose:
 */
package postfixdriver;

public class PostFixDriver 
{    
    public static void main(String[] args) 
    {
        String input = "5*4+3-2";
        String output;
        PostFix myPostFix = new PostFix(input);
        output = myPostFix.convert();
        System.out.println(output);
        
    }
    
}
