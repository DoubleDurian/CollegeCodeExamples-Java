/*
 * Program:PresidentArrayQueue
 * This:POTUS.java
 * Author:Nicholas Johnston
 * Date:3/25/2016
 * Purpose:Holds information about a president.
 */
package presidentarrayqueue;

/**
 *
 * @author thedo
 */
public class POTUS 
{
    //class member variables
    int number;//What number the presdentinet is in order since washington
    String name;//What is the name of the POTUS
    String state;//What is the state from which the POTUS hails
    String party;//What is the party of the POTUS
    String DOB;//What is their date of birth
    String DOI;//what is their date of inauguration
    //class constructors
    public POTUS()
    {
        this.DOB = "Default";
        this.DOI = "Default";
        this.name = "Default";
        this.number = 0;
        this.party = "Default";
        this.state = "Default";
    }
    public POTUS(int number, String name, String state, String party, String DOB, String DOI)
    {//Parameterized constructor
        this.number = number;
        this.name = name;
        this.state = state;
        this.party = party;
        this.DOB = DOB;
        this.DOI = DOI;
    }
    //========Getter and Setter Block==================//

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getState() 
    {
        return state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public String getParty() 
    {
        return party;
    }

    public void setParty(String party) 
    {
        this.party = party;
    }

    public String getDOB() 
    {
        return DOB;
    }

    public void setDOB(String DOB) 
    {
        this.DOB = DOB;
    }

    public String getDOI() 
    {
        return DOI;
    }

    public void setDOI(String DOI) 
    {
        this.DOI = DOI;
    }
    
    
    
}
