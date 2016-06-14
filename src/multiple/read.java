/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author miracle
 */
public class read 
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        File f=new File("e:/sivasai.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        String s;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
        br.close();       
    }
    
}
