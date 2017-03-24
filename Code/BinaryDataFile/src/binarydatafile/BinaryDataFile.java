/*
 * Program:BinaryDataFile
 * This:BinaryDataFile.java
 * Date:3/11/2016
 * Author:Nicholas Johnston
 * Purpose:To read and write to a binary data file
 */
package binarydatafile;

import java.io.IOException;


/**
 *
 * @author Nick
 */
public class BinaryDataFile 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  
    {
        WriteFile writeFile = new WriteFile("binary.txt",true);
        writeFile.writeToFile();
        
    }   
}
