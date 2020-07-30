/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author danyal
 */
public class User {

    //Class Attributes
    long id;
    String fname;
    String lname;
    String dob;
    String email;
    int sin;
    int phone;
    String address1;
    String address2;
    String postalCode;
    String city;
    String province;
    int finesOwed;

    public User() {
    }

    //Class Constructor
    public User(long id, String fname, String lname, String dob, String email, int sin, int phone, String address1, String address2, String postalCode, String city, String province, int finesOwed) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.email = email;
        this.sin = sin;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.finesOwed = finesOwed;
    }

    //Getter Methods
    public long getID() {
        return id;
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }

    public String getDOB() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public int getSIN() {
        return sin;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getFinesOwed() {
        return finesOwed;
    }

    //Setter methods for this class
    public void setID(long x) {
        id = x;
    }

    public void setFirstName(String x) {
        fname = x;
    }

    public void setLastName(String x) {
        lname = x;
    }

    public void setEmail(String x) {
        email = x;
    }

    public void setDOB(String x) {
        dob = x;
    }

    public void setAddress1(String x) {
        address1 = x;
    }

    public void setAddress2(String x) {
        address2 = x;
    }

    public void setPostalCode(String x) {
        postalCode = x;
    }

    public void setCity(String x) {
        city = x;
    }

    public void setProvince(String x) {
        province = x;
    }

    public void setSIN(int x) {
        sin = x;
    }

    public void setPhone(int x) {
        phone = x;
    }

    public void setFinesOwed(int x) {
        finesOwed = x;
    }
}
