/*
 * Program:CarWashSimulator2016
 * This:CarWashSimulator2016.java
 * Author:Nicholas Johnston
 * Date:3/28/2016
 * Purpose:To simulate a car wash and provide data as to its use 
*/
package carwashsimulator2016;
import java.util.Scanner;

public class CarWashSimulator2016 
{

    
    public static void main(String[] args) 
    {
        /*
        Queue my = new Queue();
        my.enQueue("1");
        my.enQueue("2");
        my.enQueue("3");
        my.enQueue("4");
        System.out.println(my.size());
        System.out.println(my.deQueue());
        System.out.println(my.deQueue());
        System.out.println(my.deQueue());
        System.out.println(my.deQueue());
        */
        /*
        Simulator mySim;
        for(int i=0;i<5;i++)
        {
            mySim = new Simulator(i +1);
            System.out.println("=================\n"
                    + "Number of Car washes "+ (i+1) +"\n"
                    + "=================");
            mySim.run(480);
            System.out.println("\n\n");
        }
        */
        Scanner scan = new Scanner(System.in);
        int choice;
        Menu menu = new Menu();
        boolean shouldRun = true;
        while(shouldRun)
        {
            menu.run();
            System.out.println("\nCare to go again?\n");
            System.out.println("1 = yes\n2 = no\n");
            while(!scan.hasNextInt())
            {
                System.out.println("Invalid Input\n");
                scan.nextLine();
            }
            choice = scan.nextInt();
            if(choice == 2)
            {
                shouldRun = false;
            }
        }
        
        
                
    }
    
}
