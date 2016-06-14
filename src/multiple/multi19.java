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
public class multi19 extends Thread
{ 
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        multi19 m=new multi19();
                m.setName("sivasai");
                m.setPriority(MAX_PRIORITY);
                m.start();
                multi19 m1=new multi19();
                m1.setName("kumar");
                m1.setPriority(MIN_PRIORITY);
                m1.start();
    }
}
