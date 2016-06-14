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
public class multithread extends Thread
{ 
   public void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println(Thread.currentThread().getName()+ "\t" +c);
    }
    public void sub(int x,int y)
    {
        int z;
        z=x-y;
        System.out.println(Thread.currentThread().getName()+ "\t" +z);
        
    }
    public void mul(int m,int n)
    {
        int o;
        o=m*n;
        System.out.println(Thread.currentThread().getName()+ "\t" +o);
    }
    public void div(int a,int b)
    {
        int c;
        c=a/b;
        System.out.println(Thread.currentThread().getName()+ "\t" +c);
        
    }
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("add"))
        {
            add(5,4);
        }
        else
            if(name.equals("sub"))
            {
                sub(7,4);
            }
        else
          if(name.equals("div"))
            {
              div(10,5);
             }
          else
             if(name.equals("mul"))
             {
                mul(6,2);   
              }
    }
    
    public static void main(String args[])
    {
        multithread m1=new multithread();
        m1.start();
        m1.setName("add");
        multithread m2=new multithread();
        m2.start();
        m2.setName("sub");
        multithread m3=new multithread();
        m3.start();
        m3.setName("div");
        multithread m4=new multithread();
        m4.start();
        m4.setName("mul");
    }
        
    }
