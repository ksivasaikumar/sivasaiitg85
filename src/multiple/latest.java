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
public class latest extends Thread
{
    public  void run()
    { 
        for(int i=0;i<=8;i++)
        System.out.println("this is the thread for first");
    }
public static void main(String args[])
{ 
    latest l=new latest();
    l.start();
    
}
}
