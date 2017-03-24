/*
 * Program:JavaTemplates
 * This:stringTemplates.java
 * Author:Nicholas Johnston
 * Date:5/7/2016
 * Purpose:To demonstrate difffernt things to do with strings.
 */
package javatemplates;


public class stringTemplates
{
    //--------variables-----------------------------
    String name = "gooseman";
    int age = 100;
    boolean isAlive = true;
    //--------constructor------------------------
    //-------methods----------------------------
    String cardArt()
    {//returns a formatted info card 
        String meme ="";
        meme += "=================\n"
              + "Name:"+ name+"   \n"
              + "=================\n"
              +" Age "+ age+"\n"
              + "=================\n"
              + "Alive:"+isAlive
              + "=================\n";
        meme+= name.length();
        return meme;
    }
    void run()
    {
        System.out.println(cardArt());
    }
    
}
