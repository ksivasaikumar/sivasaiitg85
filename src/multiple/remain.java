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
public class remain
{
 public static void main(String args[]) throws agedexception
 {
     age a=new age();
     a.setAge(17);
     a.setGender("m");
     a.setName("sivasai");
     a.setVoterid(1233);
     try
     {
      if(a.getAge() < 18)
      {
       throw new agedexception();
      }
     }
      catch(agedexception e)
              {
              e.validage();
              }
     
 }
}
