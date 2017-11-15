/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 * ‘******************************************************
‘***  Class Name: ObjToFile
‘***  Class Author: Angelica
‘******************************************************
‘*** Purpose of the class (Why did you write this class?)
* to serialize the objects into a file
‘***

 */
///this class is serializing
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjToFile 
{
    private ObjectOutputStream output;

    public void openFile()
    {
        try
        {
            output = new ObjectOutputStream(
                    new FileOutputStream("testFile.txt"));

        }
        catch(IOException ioException)
        {
            System.err.println("Error opening file");
        }
    }
    public void closeFile()
    {
        try
        {
            if(output != null)
                output.close();
        }
        catch(IOException ioException)
        {
            System.err.println("Error closing file");
            System.exit(1);
        }
    }
//writes everythings from the store item array
      public void writeRecord(StoreItem al)
    {
        try
        {
            output.writeObject(al);
        }
        catch (IOException ex)
        {
            System.err.println("Error writing to File");
        }
    }
 

    
    
}
