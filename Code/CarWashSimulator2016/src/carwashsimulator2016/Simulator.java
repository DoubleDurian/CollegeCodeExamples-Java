/*
 * Program:CarWash2016
 * This:Simulator.java
 * Author:Nicholas Johnston
 * Date:3/30/2016
 * Purpose:To simulate the thing
 */
package carwashsimulator2016;
import java.util.Random;
/**
 *
 * @author thedo
 */
public class Simulator 
{
    //class variables
    Random timeTillCar = new Random();//This is the random number generator
    Queue wash = new Queue();//This is the car wash
    //sim dependent variables
    int time = 1;//holds the number of ticks until the next car arrives
    int tillFinished = 7;//number of minutes until the car is clean
    int finished = 0;//number of cars washed
    int idle = 0;// number of minutes idle
    int totalCars = 0;
    //sim indepenedent variables
    int numberOfWashes = 1;
    //constructors
    public Simulator(int numberOfWashes)
    {
        this.numberOfWashes = numberOfWashes;
    }
    //class methods
    int timeTillNext()
    {//calculates what the time till the next car to enter the wash is,
        //is between 1 and ten ticks
        return (timeTillCar.nextInt(10)+1);    
    }
    void run(int duration)
    {//starts the simulation
        for(int i = 0;i<duration;i++)
        {
            tick();
            //infoDisplay();
        }
        System.out.println(finalDisplay());
    }
    void tick()
    {//increments time forward by one minnute
        //check to see if we are adding a car to the queue
        if(time == 1)
        {
            //add car to queue
            wash.enQueue("Car");
            //set time to the result of timeTill()
            time = timeTillNext();
            totalCars++;
        }
        else
        {
            time--;
        }
        //check to see if a car is done the car wash
        if(!wash.isEmpty())
        {
            if(tillFinished == 1)
            {
                tillFinished = 7;
                for(int i = 0; i < numberOfWashes;i++)
                {
                    if(wash.deQueue())
                    {
                        finished++;
                    }
                    else
                    {
                        idle++;
                    }
                    
                }
            }
            else
            {
                tillFinished--;
            }
        }
           
    }
    void infoDisplay()
    {
        String info = "Time till next car:" +time + "\nTime till finished:" + tillFinished
                +"\nNumber of Cars finished:" + finished +"\nNumber of minutes Idle:" + idle
                +"\nNumber of Cars queued:" + wash.size + "\n\n\n";
        System.out.println(info);
    }
    String finalDisplay()
    {
        String info ="Number of Cars Finished:" + finished + "\nNumber of minutes Idle:" +idle
                +"\nNumber of Cars enQueued:" + wash.size()+"\nTotal cars involved:" + totalCars;
        return info;
    }
    
}
