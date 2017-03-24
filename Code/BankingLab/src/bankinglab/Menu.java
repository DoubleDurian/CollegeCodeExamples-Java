/*
 * Program:BankingLab
 * This:BankingLab.java
 * Author:Nicholas Johnston
 * Date:4/10/2016
 * Purpose:To create a menu
 */
package bankinglab;
import java.util.Scanner;

public class Menu 
{//class variables
    Scanner userInput = new Scanner(System.in);
    String fileName;
    AccountReader account;
//class methods
    public void printWarning()
    {
        System.out.println("For the purposes of this simulation ten account files have been created."
                + "\nWhen the system asks for you to input the accounts you wish to display please enter it as 'account1.txt' through to 'account10.txt");
    }
    public void run(int number)
    {
        String finale = "";
        printWarning();
        for(int i = 0; i < number; i++)
        {
            System.out.println("Enter the file name of the account you wish to add at position " + (i+1));
            fileName = userInput.next();
            account = new AccountReader(fileName);  
            //System.out.println(formatDisplay());
            finale += formatDisplay() + "\n";
        } 
        System.out.println(finale);
    }
    public String formatDisplay()
    {
        
        String Header = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                + "Acct   Date    Amt      Type   PrevBalance   NewBalance\n"
                +"++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        String finalString = Header;
        finalString += account.read() + "\n\n";
        return finalString;
        
    }
   
    
    
}
