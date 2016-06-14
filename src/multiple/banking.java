/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class banking extends Thread
{
    int avail=1000;
    int amount;
    public void check(int amount)
    { 
        this.amount=amount;
    }
    synchronized  public void run()
    {
        synchronized(this)
        {
            System.out.println("avaliable bal" +amount);
        if(avail>=amount)
        {
              String name=Thread.currentThread().getName();
              System.out.println(amount +"the avaliable bal " +name);     
      try
      {
          Thread.sleep(200);
          amount=avail-amount;
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
        }
        else
        {
            System.out.println("the bal is not there");
        }       
      }
    }
       public static void main(String args[])
       {
           banking b=new banking();
           b.check(1000);
           Thread hus=new Thread(b);
           hus.setName("god");
           hus.start();
           Thread wife=new Thread(b);
           wife.setName("ghost");
           wife.start();
       }
}

