/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

//import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class multithread1 extends Thread
{
    @Override
    public void run()
    { 
        for(int i=0;i<=5;i++)
            System.out.println("for"+  i);
        try{
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        multithread1 m1=new multithread1();
         multithread1 m2=new multithread1();
         m1.start();
         try{
             Thread.yield();
         }
         catch(Exception e)
         {
             System.out.println(e);    
         }
         m2.start();
    }
            
}
