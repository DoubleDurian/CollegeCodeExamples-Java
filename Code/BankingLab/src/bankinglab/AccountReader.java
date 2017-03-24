/*
 * Program:BankingLab
 * This:AccountReader.java
 * Author:Nicholas Johnston
 * Date:4/8/2016
 * Purpose:This reads the files and tell ths menu object to display it
 */
package bankinglab;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thedo
 */
public class AccountReader 
{
    //class variables
    String Sammt = "";
    String SprevBalance ="";
    
    int type;
    int amount;
    int prevBalance;
    
    int newBalance =0;
    
    String input;
    Scanner scan;
    //class constructor
    public AccountReader(String input)
    {
        this.input = input;
        try 
        {
            this.scan = new Scanner(new FileReader(input));
        } catch (FileNotFoundException ex) 
        {
            Logger.getLogger(AccountReader.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    //class methods
    public String read()
    {//puts the account file into a string that the parse method will format 
        String accountString = "";
        accountString += scan.nextLine();
        String format = "";
        for(int i = 0; i <= 4; i++)
        {//parses account number
            format+= accountString.charAt(i);
        }
        format += "  ";
        for(int i = 5; i<=10;i++)
        {//parses the date
            format+= accountString.charAt(i);
        }
        format += "  ";
        for(int i = 11; i <=17;i++)
        {//parses amount
            Sammt +=accountString.charAt(i);
            format += accountString.charAt(i);
        }
        format += "  ";
        format += accountString.charAt(18);
        type = accountString.charAt(18);
        format += "    ";
        for(int i = 19; i <=26;i++)
        {//balance
            SprevBalance += accountString.charAt(i);
            
            format += accountString.charAt(i);
        }
        format += "        ";
        //System.out.println(Sammt);
        amount = Integer.valueOf(Sammt);
        
        
        prevBalance = Integer.parseInt(SprevBalance);
        
        if(type == 48)
        {
            newBalance = prevBalance;
            format += prevBalance;
        }
        else if(type== 49)
        {
            newBalance =prevBalance + amount;
            format += newBalance;
        }
        else if(type == 50)
        {
            newBalance = prevBalance - amount;
            format += newBalance;
        }
        else 
        {
            format = "Error: The account file is corrupted and could not be displayed ";
        }
        
        
        return format;
        
    }
    
    
    
}
