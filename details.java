package com.studyopedia;

public class details {public  String firstname, lastname, address, city, email, state;
    public int zip,phone;

    public void details(String firstname, String lastname, String address, String city, String email, String state, int zip, int phone) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zip = zip;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public  void setFirstname(String fname) {
        this.firstname = fname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip=zip;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
}
