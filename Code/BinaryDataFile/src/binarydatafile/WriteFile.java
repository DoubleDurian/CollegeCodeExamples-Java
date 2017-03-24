/*
 * Program:BinaryDataFile
 * This:WriteFile.java
 * Date:3/11/2016
 * Author:Nicholas Johnston
 * Purpose:WriteFile.java
 */
package binarydatafile;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Nick
 */
public class WriteFile 
{
    private String path;
    private boolean shouldAppend =true;
    
    public WriteFile(String path)
    {
        this.path = path;
    }
    public WriteFile(String path, boolean shouldAppend)
    {
        this.path = path;
        this.shouldAppend = shouldAppend;
    }
    public void writeToFile() throws IOException
    {
        FileWriter write = new FileWriter(path, shouldAppend);
        PrintWriter printInt = new PrintWriter(write);
        for(int i =0;i<100;i++)
        {
            printInt.print(setBinary());
        }
        
        printInt.close();
    }
    
    public int setBinary()
    {
        if(Math.random() >= .5)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
