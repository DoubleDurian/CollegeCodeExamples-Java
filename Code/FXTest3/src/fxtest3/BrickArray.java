/*
 * Program:FXTesting
 * This:BrickArray.java
 * Author:Nicholas Johnston
 * Date:6/3/2016
 * Purpose:Holds the array of brick positions
 */
package fxtest3;


public class BrickArray 
{
    int cross = 27;
    int down = 5;
    Brick bricks[][] = new Brick[down][cross];
    public BrickArray()
    {
        init();
    }
    void init()
    {
        for(int i =0; i < down;i++)
        {
            for(int j = 0; j <cross;j++)
            {
                bricks[i][j] = new Brick((j * 50)+15,(i *50)+10,3);
            }
        }
    }
    int checkAll(Ball ball)
    {
        int numberKilled = 0;
        for(int i =0; i <down;i++)
        {
            for(int j=0; j<cross;j++)
            {
                if(bricks[i][j].detect(ball))
                {
                    numberKilled++;
                }
                
            }
        }
        //System.out.println(numberKilled);
        return numberKilled;
    }
    void killAll()
    {
        for(int i=0;i<down;i++)
        {
            for(int j=0; j<cross;j++)
            {
                bricks[i][j].kill();
            }
        }
    }
    
}
