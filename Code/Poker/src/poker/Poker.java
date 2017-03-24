/*
 * Program:Poker
 * This:Poker.java
 * Author:Nicholas Johnston
 * Date:4/6/2016
 * Purpose:To simulate poker
 */
package poker;
import java.util.Scanner;
//====suits list==========
//Clubs 1-13
//Diamonds 14-26
//Hearts 27-38
//Spades 39 - 52
//====card modular arithmatic congruency
//deckVal->faceVal
//0->2
//1->3
//2->4
//3->5
//4->6
//5->7
//6->8
//7->9
//8->10
//9->11:JACK
//10->12:QUEEN
//11->13:KING
//12->14:ACE
public class Poker 
{
    
    public static void main(String[] args) 
    {
        /*
        Hand hand = new Hand();
        hand.insert(0);
        hand.insert(13);
        hand.insert(1);
        hand.insert(13);
        hand.insert(26);
        
        Card card = new Card(1);
        //System.out.println(hand.length +" \n" +hand.searchFace(0));
        System.out.println("RoyalFlush is " +hand.royalFlush());
        System.out.println("StraightFlush is " +hand.straightFlush());
        System.out.println("Four of kind is " +hand.fourOfKind());
        System.out.println("Full house is " +hand.fullHouse());
        System.out.println("Flush is " +hand.flush());
        System.out.println("Straight is " +hand.straight());
        System.out.println("Three of a kind is " +hand.threeOfKind());
        System.out.println("Two Pair is " +hand.twoPair());
        System.out.println("Pair is " +hand.pair());
        System.out.println(hand.format());
        */
        boolean shouldRun = true;
        Scanner daScan = new Scanner(System.in);
        int choice;
        while(shouldRun)
        {
            Table table = new Table();
            table.run();
            System.out.println("\nPlay again?\n");
            while(!daScan.hasNextInt())
            {
                System.out.println("Try again:1=yes, anything else =no");
                daScan.nextLine();
            }
            choice = daScan.nextInt();
            if(choice ==1)
            {
                shouldRun =true;
            }
            else
            {
                shouldRun = false;
            }
            
        }
        
    }
    
}
