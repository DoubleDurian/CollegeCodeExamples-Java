/*
 * Program:Poker
 * This:Card.java
 * Author:Nicholas Johnston
 * Date:4/6/2016
 * Purpose:This object holds face value, suite String, and total Ranking in the deck
 */
package poker;
//====suits list==========
//Clubs 1-13
//Diamonds 14-26
//Hearts 27-38
//Spades 39 - 52
//====card modular arithmatic congruency
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
public class Card 
{
    //====================Class memeber variables
    int deckVal;//The unique order of the card within the meta-deck
    int faceVal;//The face value of the card
    String suit;//The suite of the card
    String royal;//if the card is named it gets one of these
    boolean isRoyal = false;
    //====================Node variables
    //Card next;
    //===================Class constructor
    //This constructor takes a deckVal and turns it into card with a deckVal 
    // a faceVal and a suite
    public Card(int deckVal)
    {
        this.deckVal = deckVal;
        setSuit(deckVal);
        setFace(deckVal);
        setRoyal();
    }
    //====================Class methods
    //construction methods
    void setSuit(int deckVal)
    {
        if(deckVal >= 38)
        {
            this.suit = "SPADES";
        }
        else if(deckVal >= 26)
        {
            this.suit ="HEARTS";
        }
        else if(deckVal >= 13)
        {
            this.suit = "DIAMONDS";
        }
        else if(deckVal >=0)
        {
            this.suit = "CLUBS";
        }   
    }
    void setFace(int deckVal)
    {
        this.faceVal = (deckVal % 13)+2; 
    }
    void setRoyal()
    {
        if(faceVal >=11)
        {
            isRoyal = true;
        }
        switch(faceVal)
        {
            case 11:
                this.royal = "JACK";
                break;
            case 12:
                this.royal = "QUEEN";
                break;
            case 13:
                this.royal = "KING";
                break;
            case 14:
                this.royal = "ACE";
        }
    }
    int getFace()
    {
        return this.faceVal;
    }
    String getRoyal()
    {
        return this.royal;
    }
    boolean getIsRoyal()
    {
        return this.isRoyal;
    }
    
    public String getSuit()
    {
        return this.suit;
    }
}
