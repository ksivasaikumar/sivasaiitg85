/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import java.io.Serializable;

/**
 *
 * @author miracle
 */

 public class SerializationPOJO implements Serializable {

    private int id;
    private String name, designation, email;
    private transient long phNumber;

    public SerializationPOJO(int id, String name, String designation, long phNumber, String email) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.phNumber = phNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SerializationPOJO{" + "id=" + id + ", name=" + name + ", designation=" + designation + ", email=" + email + ", phNumber=" + phNumber + '}';
    }
}
   
