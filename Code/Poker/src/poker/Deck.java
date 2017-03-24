/*
 * Program:Poker
 * This:Deck.java
 * Author:Nicholas Johnston
 * Date:4/23/2016
 * Purpose:This deck object holds an array of ints from 0-51
   handles shuffeling and allows other objects to draw from the deck
 */
package poker;


import java.util.Random;

public class Deck 
{
    //variables
    int position = 51;
    
    int deck[] = new int[52];
    //constructors
    public Deck()
    {
        for(int i =0;i<52;i++)
        {
            deck[i] = i;
        }
        shuffle(deck);
    }
    //methods
    public void shuffle(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        position = 51;
    }
    public void display()
    {
        for(int i=51;i>=0;i--)
        {
            System.out.println(deck[i]);
        }
    }
    public int draw()
    {
        int temp = 0;
        if(position != -1)
        {
            temp = deck[position];
            position --;
        }
        
        return temp;
    }
}
