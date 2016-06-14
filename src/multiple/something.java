/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

/**
 *
 * @author miracle
 */
public class something extends Thread
{
int available=1;
    int wanted;
    public void setWanted(int wanted)
    {
        this.wanted=wanted;
    }
    /*synchronized */ public void run()
    {
        //synchronized(this)
        //{
        System.out.println("Avaliable Number of tickets are"+available);
        
        if(available>=wanted)
        {
            String name=Thread.currentThread().getName();
            System.out.println(wanted+"ticket is alloted for"+name);
            try
            {
                Thread.sleep(200);
                available=available-wanted;
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
        else
        {
            System.out.println("Tickets are not available");
        }
    }
    //}
    public static void main(String args[])
    {
        something r1=new something();
        r1.setWanted(1);
        Thread t1=new Thread(r1);
        t1.setName("First Person");
        t1.start();
        Thread t2=new Thread(r1);
        t2.setName("SecondPerson");
        t2.start();
        
    }    
}
