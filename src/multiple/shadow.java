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
public class shadow extends developer
{
    public void assignduty6(int id,String name)
    {
        System.out.println(id+ "\t" + name);
        System.out.println("this is the duty of shadow behind developer");
    }
    public static void main(String args[])
    {
        shadow a=new shadow();
        a.assigduty1(1, "suamnth");
        a.assignduty2(2, "delivery");
        a.assignduty4(3, "project");
        a.assignduty5(4, "teamlead");
        a.assignduty6(5,"shadow");
        a.assignduty(11, "prasadlokam");
    }       
}
