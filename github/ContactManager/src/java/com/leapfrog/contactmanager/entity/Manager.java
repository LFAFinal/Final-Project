
package com.leapfrog.contactmanager.entity;
import java.util.Date;
/**
 *
 * @author Anonymous
 */
public class Manager {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Date DOB;
   /* private String loanAmount;
    private Date takenDate;
    private Date promiseDate;
    private double interestRate;
*/

    public Manager() {
    }

    public Manager(int id, String name, String email, String phone, String address, Date DOB) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.DOB = DOB;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Manager{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", DOB=" + DOB + '}';
    }

    
    
    
    
}