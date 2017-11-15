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
‘***  Class Name: FileToObj
‘***  Class Author Angelica
‘******************************************************
‘*** Purpose of the class (Why did you write this class?)
* To deserialize objects from the file
‘***

 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class FileToObj
{
    //classmate Emily Farias suuggested creating a storeItem array
    public ArrayList<StoreItem> storeItems;

        private ObjectInputStream input;

    public void openFile()
    {
        try
        {
            input = new ObjectInputStream( new FileInputStream("testFile.txt"));
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
            if(input != null)
                input.close();
        }
        catch(IOException ioException)
        {
            System.err.println("Error closing file");
            System.exit(1);
        }
    }
//this deserialized
    public StoreItem readRecord()
    {
        StoreItem record = new  StoreItem();
        try
        {
            Object test ;
            test = input.readObject();
            String testType = test.getClass().toString();
            //find the locationn
            int loc = testType.lastIndexOf(".");
            String typename = testType.substring(loc+1);
            
            System.out.println("My type is " + typename);  
            
            //if this works out, then the item will be matched to the class or type that it is
            if(typename.equals("paintings"))
            {
                record = (paintings) test;
                
            }
            else if(typename.equals("movies"))
            {
                record = (movies) test;
            }
            else
            {
                record = (books)test;
            }
            

        }
        catch (IOException ex)
        {
            System.err.println("Error writing to File");
        }
        catch (Exception ex)
        {
            System.err.println("Other error");
        }
        return record;
    }

    
}
