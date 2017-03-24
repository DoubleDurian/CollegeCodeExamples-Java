/*
 * Program:CarWashSimulator2016
 * This:Menu.java
 * Author:Nicholas Johnston
 * Date:4/2/2016
 * Purpose:To handle inputs from the user and to generate a ticket stub that
           allows it user to learn if the car wash is worth it for them.
 */
package carwashsimulator2016;
import java.util.Scanner;
/**
 *
 * @author thedo
 */
public class Menu 
{
    //class variables
    double profit = 0;//the money made per car completed
    double totalProfit;//profit * number of cars
    double cost = 0;//the cost of each idle minute
    double totalCost;//costs * idle minutes
    double value;//the final value of the profit - cost
    boolean worthIt; //if value is negative then worthIt is false;
    Scanner scan = new Scanner(System.in);
    //class methods
    public void run()
    {//runs the menu as well as the simulation
        inputInfo();
        Simulator mySim;
        for(int i=0;i<10;i++)
        {
            mySim = new Simulator(i +1);
            System.out.println("=================\n"
                    + "Number of Car washes "+ (i+1) +"\n"
                    + "=================");
            mySim.run(480);
            totalProfit = profit * mySim.finished;
            totalCost = cost * mySim.idle;
            value = totalProfit-totalCost;
            if(value > 0)
            {
                worthIt = true;
            }
            else
            {
                worthIt = false;
            }
            System.out.println("=================\n"
                    + "Final Verdict\n"
                    + "======================\n"
                    + "The total profit is " + totalProfit
                    + "\nThe total cost of operations are " + totalCost
                    + "\nThe final value of the operation is " + value
                    );
            if(worthIt)
            {
                System.out.println("The operation is profitable and worth it.\n");
            }
            else
            {
                System.out.println("The operation is not profitable and is not worth it.\n");
            }
            System.out.println("\n");
        }
        
        
    }
    public void inputInfo()
    {//requests the information from the user
        System.out.println("Hello, welcome to car simulator 2016\n"
        +"Please enter the profit per car washed");
        while(!scan.hasNextDouble())
        {
            System.out.println("That is not a valid input, please re-enter a number");
            scan.nextLine();
        }
        profit = scan.nextDouble();
        profit = Math.abs(profit);
        System.out.println("Please enter cost per idle minute");
        while(!scan.hasNextDouble())
        {
            System.out.println("That is not a valid input, please re-enter a number");
            scan.nextLine();
        }
        cost = Math.abs(scan.nextDouble());
        
        
    }
    
}
