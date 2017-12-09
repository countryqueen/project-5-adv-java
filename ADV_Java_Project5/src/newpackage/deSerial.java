/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 * 
 */
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class deSerial 
{
    /*
    Method Name: combine()
    Purpose: takes the linklist of book,movie,and painting and places them in an arraylist
    Parameter: LinkList<Book>,LinkList<Movie>,LinkList<Painting>
    Method Input: none
    Return Value: ArrayList<StoreItem>
    Date: 11/13/2017
    */ 
    private ArrayList<StoreItem> combine(LinkedList<books> books1,LinkedList<movies> movies1,LinkedList<paintings> paintings1)
    {
        ArrayList<StoreItem> items= new ArrayList<>();
                                
        //Iterates through linklist and saves objects in the array
        ListIterator<books> temp = books1.listIterator();
        do{ items.add(temp.next());} while(temp.hasNext());
        //Iterates through linklist and saves objects in the array        
        ListIterator<movies> temp1 = movies1.listIterator();
        do{items.add(temp1.next());} while(temp1.hasNext());    
        //Iterates through linklist and saves objects in the array       
        ListIterator<paintings> temp3 = paintings1.listIterator();
        do{items.add(temp3.next());} while(temp3.hasNext());
        
        return items;
    }
    /*
    Method Name: serialize()
    Purpose: serialize objects found in the array
    Parameter: LinkList<Book>,LinkList<Movie>,LinkList<Painting>
    Method Input: none 
    Return Value: none
    Date: 11/13/2017
    */     
    public void serialize(ArrayList<StoreItem> items)
    {
        
        
        String userDirLocation = System.getProperty("user.dir");
                
        File userDir = new File(userDirLocation);
        JFileChooser fileChooser = new JFileChooser(userDir);
        int returnValue = fileChooser.showOpenDialog(null);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
            
            try 
            {
                try 
                {
                    FileOutputStream fileOut = new FileOutputStream(selectedFile);
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
                    for (int i = 0; i < items.size(); i++)  //iterate throught the arraylist until all objects are serialized on the textfile
                    {                        
                        StoreItem item = items.get(i);
                        out.writeObject(item);
                    }
                    JOptionPane.showMessageDialog(null,"Items serialized to file.");
                    
                    out.close();
                    
                    fileOut.close();
                    
                   
                } 
                catch (IOException i) 
                {
                    i.printStackTrace();
                }
            } 
            catch (Exception ex) 
            {}
        } // END if approve option fileChooser
    }
  
    /*
    Method Name: deserialize()
    Purpose: deserialize object from textfile into an array
    Parameter: none
    Method Input: none
    Return Value: arrayList<>
    Date: 11/13/2017
    */     
    public ArrayList<StoreItem> deserialize()
    {
        int MAX_SIZE = 100;
        
        ArrayList<StoreItem> items = new ArrayList<>();
        
        String userDirLocation = System.getProperty("user.dir");
        File userDir = new File(userDirLocation);
        JFileChooser fileChooser = new JFileChooser(userDir);
        int returnValue = fileChooser.showOpenDialog(null);
            

        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
                    
            try 
            {                        
                try 
                {
                    try (FileInputStream fileIn = new FileInputStream(selectedFile); ObjectInputStream in = new ObjectInputStream(fileIn)) 
                    {
                        
                        for (int i = 0; i < MAX_SIZE; i++) //iterate through an array and place objects in the array
                        {
                            StoreItem item = (StoreItem) in.readObject(); 
                            items.add(item);
                        }
                        
                    }
                    
                    JOptionPane.showMessageDialog(null, "Items deserialized from file.");
                    
                } 
                catch (EOFException e) 
                {} 
                catch (IOException i) 
                {
                    i.printStackTrace();
                } 
                catch (ClassNotFoundException c) 
                {
                    c.printStackTrace();
                }
                
                
            } 
            catch (Exception ex) 
            {}
        } // END if file chooser approve option

            
        return items;

    }    
}
