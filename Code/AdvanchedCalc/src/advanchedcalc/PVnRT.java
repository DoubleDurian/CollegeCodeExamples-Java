/*
 * Program:AdvancedCalc
 * This:
 * Author:
 * Date:
 * Purpose:
 */
package advanchedcalc;

import java.util.Scanner;
public class PVnRT 
{
    //variables
    boolean pUnknown = false;
    boolean vUnknown = false;
    boolean nUnknown = false;
    boolean rUnknown = false;
    boolean tUnknown = false;
    int choice =0;
    Scanner scan = new Scanner(System.in);
    
    //units are = L atm/mol K
    
    double p;
    double v;
    final double r=0.08206;;
    double n;
    double t;
    //constructor
    public PVnRT(double p, double v, double n,double t)
    {
        init(p,v,n,t);   
    }
    //methods
    void init(double p, double v, double n,double t)
    {
        this.p = p;
        this.v = v;
        this.n = n;
        this.t =t;
        if(detectError())
        {
            detectUnknown();
            if(pUnknown)
            {
                double answer = (this.n)*(r)*(this.t)/(this.v);
                System.out.println(answer +" atm");
            }
            else if(vUnknown)
            {
                double answer = (this.n)*(r)*(this.t)/(this.p);
                System.out.println(answer +" L");
            }
            else if(nUnknown)
            {
                double answer = (this.p)*(this.v)/(this.t)/(r);
                System.out.println(answer +" mol");
            }
            else if(tUnknown)
            {
                double answer = (this.p)*(this.v)/(this.n)/(r);
                System.out.println(answer +" K");
            }
            //do the math, get the answer
        }
        System.out.println("Do you want to go again?");
        choose();
        if(choice == 1)
        {
            getValue();
            init(p,v,n,t);
        }
    }
    boolean detectError()
    {//ensures there is only one unknown
        int zeroes = 0;
        double[] values = new double[5];
        for(int i =0; i< 5;i++)
        {
            if(values[i]==0)
            {
                zeroes++;
            }
        }
        return (zeroes == 1);
    }
    void detectUnknown()
    {//says it on the can
        if(p==0)
        {
            pUnknown = true;
        }
        else if (v==0)
        {
            vUnknown = true;
        }
        else if(r==0)
        {
            System.out.println("You fucked up something firce");
        }
        else if(n==0)
        {
            nUnknown = true;
        }
        else if (t==0)
        {
            tUnknown = true;
        }
        else
        {
            System.out.println("An error was detected, all variables are known");
        }
    }
    void choose()
    {
        
        System.out.println("1:Yes\n2:No");
        while(!scan.hasNextInt())
        {
            System.out.println("That was not a valid input");
            scan.nextLine();
        }
        choice = scan.nextInt(); 
    }
    void getValue()
    {
        System.out.println("Give me P:");
        while(!scan.hasNextDouble())
        {
            System.out.println("Nope");
            scan.nextLine();
        }
        p = scan.nextDouble();
        System.out.println("Give me V:");
        while(!scan.hasNextDouble())
        {
            System.out.println("Nope");
            scan.nextLine();
        }
        v = scan.nextDouble();
        System.out.println("Give me N:");
        while(!scan.hasNextDouble())
        {
            System.out.println("Nope");
            scan.nextLine();
        }
        n = scan.nextDouble();
        System.out.println("Give me T:");
        while(!scan.hasNextDouble())
        {
            System.out.println("Nope");
            scan.nextLine();
        }
        t = scan.nextDouble();
    }
}
