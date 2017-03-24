/*
 * Program:JavaTemplates
 * This:booleanTemplate.java
 * Author:Nicholas Johnston
 * Date:5/7/2016
 * Purpose:To demonstrate booleans and comparators
 */
package javatemplates;


public class booleanTemplate 
{
    //-----------------variables-----------
    boolean shouldRun = true;
    boolean isTrue;

    boolean skyIsBlue = true;
    int number = 0;
    //-----------------constructors--------
    
    //-----------------methods-------------
    void toTen()
    {
        while(number<10)
        {
            number++;
        }
    }
    boolean compare(int a, int b)
    {
        return a >b;
    }
    void run()
    {
        isTrue = compare(4,2);
        truthTable(true,false);
    }
    String truthTable(boolean x, boolean y)
    {
        String info = "";
        info+="If X is " + x +" and Y is " + y
                +"\nthen it stands to reason that\n "
                + "X and Y is "+(x&&y)+"\nand\n"
                + "X or Y is " + (x||y)+"\nand\n"
                + "X xor Y is " + (x^y);
        return info;
    }
    
   
    
}
