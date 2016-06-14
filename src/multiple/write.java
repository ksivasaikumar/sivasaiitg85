/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author miracle
 */
public class write 
{
    public static void main(String args[]) throws IOException
    {
        try
        {
            File f=new File("e:/sivasai.txt");
            String s="this is the file from my creation";
            FileWriter fw=new FileWriter(f);
            fw.write(s);
            fw.close();
            System.out.println("file is created");
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
    }    
}
   
