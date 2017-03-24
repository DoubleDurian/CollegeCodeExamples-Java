/*
 * Program:FXTesting3
 * This:PLayer.java
 * Author:Nichoals Johnston
 * Date:6/3/2016
 * Purpose:To hold values of the player object
 */
package fxtest3;


public class Player 
{
    //vairbles
    int xPos;
    int yPos;
    int xSize;
    int ySize;
    
    int xVec=0;
    int yVec =0;
    int maxSpeed =20;
    int minSpeed = -20;
    //constructors
    public Player()
    {
        xPos = 0;
        yPos = 600;
        xSize = 250;
        ySize = 10;
        
    }
    
    public Player(int x,int y)
    {
        this.xPos = x;
        this.yPos = y;
    }
    //methods
    void xDelta()
    {//moves player along the x axis
        xPos += xVec;
        if(xPos<0)
        {
            xPos=0;
        }
        if((xPos > 1116))
        {
            xPos=1116;
        }
    }
    void yDelta()
    {//moves player along the y axis
        yPos += yVec;
        if(yPos > 730)
        {
            yPos=730;
        }
        if(yPos <625)
        {
            yPos = 625;
        }
    }
    void increaseXVec()
    {
        if(xVec<maxSpeed)
        {
            xVec++;
        }
    }
    void increaseYVec()
    {
        if(yVec<maxSpeed)
        {
            yVec+=2;
        }
    }
    void decreaseXVec()
    {
        if(xVec > minSpeed)
        {
            xVec-=2;
        }
    }
    void decreaseYVec()
    {
        if(yVec > minSpeed)
        {
            yVec--;
        }
    }
    void normalizeX()
    {
        if(xVec<0)
        {
            xVec++;
        }
        else if(xVec >0)
        {
            xVec--;
        }
        //System.out.println("norm x");
    }
    void normalizeY()
    {
        if(yVec<-2)
        {
            yVec-=10;
            //yVec = 0;
        }
        else if(yVec >2)
        {
            
            //yVec--;
            //yVec = 0;
        }
    }
    
}
