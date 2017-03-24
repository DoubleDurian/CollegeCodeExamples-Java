/*
 Program:FrameRateManager
 * This:Control.java
 * Author:Nicholas Johnston
 * Date:4/17/2016
 * Purpose:This handles the position and vector of a player object
 */
package frameratetemplate;

public class Player 
{
    //class vaiables
    int xPos;
    int yPos;
    //vector variables
    int xVec=0;
    int yVec =0;
    int maxSpeed =10;
    int minSpeed = -10;
    //class constructor
    public Player()
    {
        xPos = 10;
        yPos = 20;
    }
    public Player(int x,int y)
    {
        this.xPos = x;
        this.yPos = y;
    }
    //class methods
    //=================
    //DELTA BLOCK
    //================
    void xDelta()
    {
        xPos += xVec;
    }
    void yDelta()
    {
        yPos += yVec;
    }
    //===============
    //Validator block
    //===============
    boolean xIsPositive()
    {
        return (xVec >=0);
    }
    boolean yIsPositive()
    {
        return (yVec >=0);
    }
    //==================
    //accelaration block
    //==================
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
            yVec++;
        }
    }
    void decreaseXVec()
    {
        if(xVec > minSpeed)
        {
            xVec--;
        }
    }
    void decreaseYVec()
    {
        if(yVec > minSpeed)
        {
            yVec--;
        }
    }
    //=============
    //friction block
    //=============
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
        if(yVec<0)
        {
            yVec++;
            //yVec = 0;
        }
        else if(yVec >0)
        {
            
            yVec--;
            //yVec = 0;
        }
    }
}
