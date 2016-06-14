/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class SerializationImpl 
{
public static void main(String[] args) {

        int id, n;
        String name, designation, email;
        long phNumber;
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter Number of Objects to create:\t");
//        n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {

            System.out.print("Id\t\t:\t\t");
            id = scanner.nextInt();

            System.out.print("Name\t\t:\t\t");
            name = scanner.next();

            System.out.print("Designation\t:\t\t");
            designation = scanner.next();

            System.out.print("Phone Number\t:\t\t");
            phNumber = scanner.nextLong();

            System.out.print("E-Mail Id\t:\t\t");
            email = scanner.next();

            SerializationPOJO sp = new SerializationPOJO(id, name, designation, phNumber, email);

            SerializationImpl si = new SerializationImpl();
            si.implementaion(sp);
//        }
    }

    private void implementaion(SerializationPOJO sp) {
        ObjectOutputStream objectOutputStream;
        try {

            objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://" + sp.getId() + ".ser"));
            objectOutputStream.writeObject(sp);
            objectOutputStream.close();

            System.out.println("Serialization Completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
