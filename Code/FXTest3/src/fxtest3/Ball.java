/*
 * Program:FXTest3
 * This:Ball.java
 * Author:Nicholas Johnnston
 * Date:6/3/2016
 * Purpose:to act as a ball object
 */
package fxtest3;


public class Ball 
{
    //variables
    int xPos;
    int yPos;
    //vetor
    int xVec;
    int yVec;
    //speed
    int maxSpeed=20;
    int optSpeed=5;
    //constructor()
    public Ball()
    {
        this.xPos = 500;
        this.yPos = 300;
        this.xVec = -optSpeed;
        this.yVec = optSpeed;
        
    }
    void xDelta()
    {//changes positoon aling the x axis 
        xPos += xVec;
        if(xPos <0)
        {
            xPos = 0;
            reflectX();
        }
        else if(xPos >1346)
        {
            xPos = 1346;
            reflectX();
        }
    }
    boolean yDelta(Player player)
    {//changes pisiton along the y axis
        yPos += yVec;
        if(yPos <0)
        {
            yPos = 0;
            reflectY();
            return false;
        }
        else if( (xPos >player.xPos) &&(xPos <player.xPos +250)&& (yPos == player.yPos-15))
        {
            
            reflectY();
            return false;
        }
        else if(yPos> 760)
        {
            yPos = 760;
            reflectY();
            return true;
        }
            
        return false;
    }
    boolean Delta(Player player)
    {
        xDelta();
        return yDelta(player);
    }
    void normalizeX()
    {
        if(xVec < optSpeed)
        {
            xVec = optSpeed;
        }
        else if(xVec > optSpeed)
        {
            xVec--;
        }
    }
    void normalizeY()
    {
        if(yVec < optSpeed)
        {
            yVec = optSpeed;
        }
        else if(yVec >optSpeed)
        {
            yVec--;
        }
    }
    void normalize()
    {
        normalizeX();
        normalizeY();
    }
    void limitVec()
    {
        if(xVec >maxSpeed)
        {
            xVec=maxSpeed;
        }
        if(yVec>maxSpeed)
        {
            yVec = maxSpeed;
        }
    }
    void check()
    {
        limitVec();
        normalize();
    }
    void reflectX()
    {
        xVec = xVec*-1;
    }
    void reflectY()
    {
        yVec = yVec*-1;
    }
    
}
