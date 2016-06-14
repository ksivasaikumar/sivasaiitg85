/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author miracle
 */
public class writeproperties 
{
 public static void main(String args[]) 
 {
     properties p=new properties();
     OutputStream first=null;
     try
     {
     first=new FileOutputStream("sivasai.properties");
     p.setProperty("empid","3455");
     p.setProperty("ename","sivasai");
     p.store(first,"details");
 }
 catch(Exception e)
 {
     System.out.println(e);
 }
     finally{
         if(first!=null)
         {
             try{
                 first.close();
             }
             catch(IOException i)
             {
                 System.out.println(i);
             }
         }
     }
}
}
