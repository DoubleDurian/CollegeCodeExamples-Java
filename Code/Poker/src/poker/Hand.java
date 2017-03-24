/*
 * Program:Poker
 * This:Hand.java
 * Author:Nicholas Johnston
 * Date:4/6/2016
 * Purpose:This is a linked list stack that serves the purpose of the hand
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
public class Hand 
{
    //class variables
    Card[] handStack = new Card[5];
    int length = -1;
    int ranking;
    //class methods
    public boolean isEmpty()
    {//detects if the hand is empty
        return (length ==-1);
    }
    public boolean isFull()
    {//detects if the list is full
        return (length ==4);
    }
    public void insert(int deckVal)
    {//adds a card to the hand
        if(!isFull())
        {
            length++;
            Card card = new Card(deckVal);
            handStack[length] =card;
        }
    }
    public Card remove(int position)
    {//removes a card at the position if it exists
        if(!isEmpty())
        {
            Card temp = handStack[position];
            handStack[position] = null;
            return temp;
        }
        return null;
    }
    public void pack()
    {//if a card has been removed this methods will pack the contents of the 
        //hand and deincremement to length
        for(int i = 0; i < length;i++)
        {
            
        }
    }
    public int rankingDetect()
    {//detects the value of the current hand
        int rank;
        if(royalFlush())
        {
            rank = 10;
        }
        else if(straightFlush())
        {
            rank =9;
        }
        else if(fourOfKind())
        {
            rank =8;
        }
        else if (fullHouse())
        {
            rank = 7;
        }
        else if(flush())
        {
            rank = 6;
        }
        else if(straight())
        {
            rank = 5;
        }
        else if(threeOfKind())
        {
            rank = 4;
        }
        else if(twoPair())
        {
            rank = 3;
        }
        else if(pair())
        {
            rank = 2;
        }
        else
        {
            rank = 1;
        }
        return rank;
    }
    public boolean royalFlush()
    {//detects a royal flush
        if(allMatch()&&searchFace(14)&&searchFace(13)&&searchFace(12)&&searchFace(11)&&searchFace(10))
        {//if all suits match
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean straightFlush()
    {
        return (allMatch()&&sequence());
    }
    public boolean fourOfKind()
    {
        return (ofKind()==4);
    }
    public boolean fullHouse()
    {
        int howMany =0;
        int tempNumber=0;
        int pairs =0;
        Card searcher;
        Card iterator;
        for(int i =0; i <=length; i++)
        {
            searcher = handStack[i];
            tempNumber = 0;
            for(int j=0; j <=length; j++)
            {
                
                iterator = handStack[j];
                if(searcher.getFace() == iterator.getFace())
                {//the number of cards matching the card being searched
                    tempNumber++;
                    //System.out.println(tempNumber);
                }
                
            }
            if(tempNumber ==2)
                {
                    pairs++;
                }
            if(tempNumber ==3)
                {
                    pairs++;
                }
            
        }
        //System.out.println(pairs);
        return (pairs ==5) ;
    }
    public boolean flush()
    {
        return (allMatch()&&!sequence());
    }
    public boolean straight()
    {
        return (sequence()&&!allMatch());
    }
    public boolean threeOfKind()
    {
        return (ofKind()==3);
    }
    public boolean twoPair()
    {//how many matching cards do you have?
        int howMany =0;
        int numberOfPairs=0;
        Card searcher;
        Card iterator;
        for(int i =0; i <=length; i++)
        {
            int tempNumber=0;

            searcher = handStack[i];
            
            for(int j=0; j <=length; j++)
            {
                iterator = handStack[j];
                if(searcher.getFace() == iterator.getFace())
                {
                    tempNumber++;
                }
            }
            //System.out.println(tempNumber);
            if(tempNumber == 2)
            {
                numberOfPairs ++;

            }
            
        }
        //System.out.println(howMany );
        return numberOfPairs==4;
    }
    public boolean pair()
    {
        return (ofKind()==2);
    }
    public int highCard()
    {
        int highest=0;
        Card searcher;
        for(int i = 0; i <=length; i++)
        {
            searcher = handStack[i];
            if(searcher.getFace()>  highest)
            {
                highest = searcher.getFace();
            }
        }
        return highest;
    }
    public boolean searchFace(int faceVal)
    {//returns true if the hand contains a card congruent to the face value
        Card searcher;
        for(int i = 0; i <= length; i++)
        {
            searcher = handStack[i];
            //System.out.println(searcher.getFace());
            if(searcher.getFace() == (faceVal))
            {
                return true;
            }
        }
        return false;
    }
    public int matchingSuits(String suit)
    {//returns the number of cards in the hand that match this suit
        Card searcher;
        int totalMatching =0;
        for(int i = 0; i <= length; i++)
        {
            searcher = handStack[i];
            //System.out.println(searcher.suit);
            if(searcher.getSuit().equals(suit))
            {
                totalMatching++;
            }
        }
        return totalMatching;
    }
    public boolean allMatch()
    {//returns true if all cards are matching suits
        if(matchingSuits("CLUBS")==5)
        {
            return true;
        }
        else if(matchingSuits("SPADES")==5)
        {
            return true;
        }
        else if(matchingSuits("DIAMONDS")==5)
        {
            return true;
        }
        else if(matchingSuits("HEARTS")==5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean sequence()
    {//returns true if all five cards are a sequence ie 1,2,3,4,5
        
        int lowest = 14;
        Card searcher;
        for(int i=0;i<=length;i++)
        {//set the card to the lowest card in the hand
            searcher = handStack[i];
            if(searcher.getFace() < lowest)
            {
                lowest = searcher .getFace();
            }
        }
        if(searchFace(lowest+1)&&searchFace(lowest+2)
                &&searchFace(lowest+3)&&searchFace(lowest+4))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int ofKind()
    {//how many matching cards do you have?
        int howMany =0;
        int value=0;
        Card searcher;
        Card iterator;
        for(int i =0; i <=length; i++)
        {
            int tempNumber=0;

            searcher = handStack[i];
            
            for(int j=0; j <=length; j++)
            {
                iterator = handStack[j];
                if(searcher.getFace() == iterator.getFace())
                {
                    tempNumber++;
                }
            }
            //System.out.println(tempNumber);
            if(tempNumber >= howMany)
            {
                howMany = tempNumber;

            }
            if(searcher.getFace()>value)
            {
                value = searcher.getFace();
                
            }
        }
        //System.out.println(howMany );
        return howMany;
    }
    int higherMatch()
    {//returns the highest matching face value card int
        
        int howMany =0;
        int tempNumber=0;
        int value=0;
        Card searcher;
        Card iterator;
        for(int i =0; i <=length; i++)
        {
            searcher = handStack[i];
            
            for(int j=0; j <=length; j++)
            {
                iterator = handStack[j];
                if(searcher.getFace() == iterator.getFace())
                {
                    tempNumber++;
                }
            }
            if(searcher.getFace()>value)
            {
                value = searcher.getFace();
            }
        }
        return value;
        
    }
    public String format()
    {//creates ascii art to represent the cards in the game
        String info = "";
        String upper = "=============\n"
                +      "|           |\n"
                      +"|           |\n"
                      +"|           |\n";
        String lower = "|           |\n"
                      +"|           |\n"
                      +"|           |\n"
                       +"============\n\n\n";
        Card searcher;
        String cap= "------------     ";
        String mid= "|          |     ";
        for(int i = 0; i<=length; i++)
        {//prints the top of the cards
            info+=cap;
        }
        info += "\n";
        for(int j = 0; j<=2; j++)
        {
            for(int i = 0 ; i<=length; i++)
            {//prints internal space upper
                info+=mid;
            }
            info+="\n";
        }
        for(int i = 0; i<= length; i++)
        {
            searcher = handStack[i];
            if(searcher.getFace() ==14)
            {
                info += "|   "+"ACE" + "    |     ";
            }
            else if(searcher.getFace()==13)
            {
                info += "|  "+"KING" + "    |     ";
            }
            else if(searcher.getFace()==12)
            {
                info += "|  "+"QUEEN" + "   |     ";
            }
            else if(searcher.getFace()==11)
            {
                info += "|  "+"JACK" + "    |     ";
            }
            else if(searcher.getFace()>=10)
            {
                info += "|    "+searcher.getFace() + "    |     ";
            }
            else
            {
                info += "|    "+searcher.getFace() + "     |     ";
            }
        }
        info+="\n";
        
        
        for(int i = 0 ; i<=length; i++)
        {//prints "OF" in the center of the cards
                info+="|    "+"OF" + "    |     ";
        }
        info+="\n";
        
        for(int i = 0; i<= length; i++)
        {
            searcher = handStack[i];
            if(searcher.getSuit() == "CLUBS")
            {
                info += "|  "+"CLUBS"+ "   |     ";
            }
            else if(searcher.getSuit()=="DIAMONDS")
            {
                 info += "| "+"DIAMONDS"+ " |     ";
            }
            else if(searcher.getSuit() == "SPADES")
            {
                 info += "|  "+"SPADES"+ "  |     ";
            }
            else if(searcher.getSuit() == "HEARTS")
            {
                 info += "|  "+"HEARTS"+ "  |     ";
            }
            
        }
        
        info+="\n";
        for(int j = 0; j<=2; j++)
        {
            for(int i = 0 ; i<=length; i++)
            {//prints internal space upper
                info+=mid;
            }
            info+="\n";
        }
        for(int i = 0; i<=length; i++)
        {//prints the top of the cards
            info+=cap;
        }
        
        
        /*
        for(int i = 0; i<= length; i++)
        {
            searcher = handStack[i];
            String newINFO = "|    "+searcher.faceVal +"     |\n"
                    + "|    "+searcher.deckVal+"     |\n";
            info = info +upper + newINFO + lower;
        }
        */
        return info;
    }
}
