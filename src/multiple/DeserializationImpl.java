/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author miracle
 */
public class DeserializationImpl 
{
 public static void main(String[] args) {

        SerializationPOJO sp = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://3455.ser"));

            sp = (SerializationPOJO) objectInputStream.readObject();

            System.out.println("------------------ Data in the object ------------------");
            System.out.println("Id\t\t:\t\t" + sp.getId());
            System.out.println("Name\t\t:\t\t" + sp.getName());
            System.out.println("Designation\t:\t\t" + sp.getDesignation());
            System.out.println("Phone Number\t:\t\t" + sp.getPhNumber());
            System.out.println("E-Mail Id\t:\t\t" + sp.getEmail());
            System.out.println("--------------------------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
}
