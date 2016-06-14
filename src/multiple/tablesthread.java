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
public class tablesthread extends Thread
{
   synchronized public void mul1()
   {
     synchronized(this)
    {
        for(int i=1;i<=12;i++)
        {
            System.out.println(5+"*"+i+"="+ (5*i));    
        }
    }
   }
    public void mul2()
    {
        for(int i=1;i<=12;i++)
        {
            System.out.println(10+"*"+i+"="+(10*i));
        }
    }
    public void mul3()  
    {
        for(int i=1;i<=12;i++)
        {
            System.out.println(2+"*"+i+"="+(2*i));
        }
    }
   @Override
    public void run()
    {
        mul1();
        mul2();
        mul3();
        
    }
    public static void main(String args[])
    {
        tablesthread t1=new tablesthread();
        t1.start();
        tablesthread t2=new tablesthread();
        t2.start();
        tablesthread t3=new tablesthread();
        t3.start();
    }
}
