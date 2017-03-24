/*
 * Program:BankingLab
 * This:BankingLab.java
 * Author:Nicholas Johnston
 * Date:4/8/2016
 * Purpose:To take input from a file and read the information as an account
 */
package bankinglab;
import java.util.Scanner;

public class BankingLab 
{
    //
    //       all files are named account1.txt through to account10.txt
    //
    public static void main(String[] args) 
    {
        //runtime variables 
        int numberOfAccounts;
        int choice;
        boolean shouldRun = true;
        Scanner scanNumber = new Scanner(System.in);
        //AccountReader ar = new AccountReader("account2.txt");
        Menu menu = new Menu();
        while(shouldRun)
        {
            System.out.println("How many accounts would you like to compare and display");
            while(!scanNumber.hasNextInt())
            {
                scanNumber.nextLine();
            }
            numberOfAccounts = scanNumber.nextInt();
            menu.run(numberOfAccounts);
            System.out.println("Continue running?\n1:yes\n2:no");
            while(!scanNumber.hasNextInt())
            {
                scanNumber.nextLine();
            }
            choice = scanNumber.nextInt();
            if(choice==1)
            {
                shouldRun = true;
            }
            else
            {
                shouldRun = false;
            }
        }
    }
}
