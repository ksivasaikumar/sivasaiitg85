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
public class newthread extends Thread
{
    @Override
    public void run()
    { 
      for(int i=0;i<=4;i++)
      {
          System.out.println("this is the thread for sleep method"+ Thread.currentThread().getName());
      }
    }
    public static void main(String args[]) throws InterruptedException
    {
        newthread n=new newthread();
        n.start();
        n.sleep(100);
        n.setName("sivasai");
        newthread n1=new newthread();
        n1.start();
        n1.setName("kumar");
        
    }
            
}
