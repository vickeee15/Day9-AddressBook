package com.studyopedia;

import java.util.ArrayList;
import java.util.Scanner;

public class addressBook {
    public static ArrayList<details> array=new ArrayList<details>();


    public static void add() {

        Scanner sc = new Scanner(System.in);
        System.out.println("first name:");
        String firstname = sc.nextLine();
        System.out.println("first name:");
        String lastname = sc.nextLine();
        System.out.println("address:");
        String address = sc.nextLine();
        System.out.println("city:");
        String city = sc.nextLine();
        System.out.println("State:");
        String state = sc.nextLine();
        System.out.println("zip:");
        int zip = sc.nextInt();
        System.out.println("phone:");
        int phone = sc.nextInt();
        System.out.println("Email:");
        String email = sc.nextLine();
        details personinfo=new details(firstname,lastname,address,city,state,zip,phone,email);
        System.out.println(personinfo);
    }
    public static void display(details personinfo){
        System.out.println("firstname:" + personinfo.getFirstname());
        System.out.println("lastname:" + personinfo.getLastname());
        System.out.println("address:" + personinfo.getAddress());
        System.out.println("city:" + personinfo.getCity());
        System.out.println("State:" + personinfo.getState());
        System.out.println("zip:" + personinfo.getZip());
        System.out.println("phone:" + personinfo.getPhone());
        System.out.println("email:" + personinfo.getEmail());

    }

    public static void edit() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter first name to start editing: ");
        String ename = a.next();
        for(int i=1;i<=8;i++){
            if(array.get(i).getFirstname().equals(ename)){
                System.out.println("Options to edit :1) firstname 2)lastname 3)address 4)city 5)state 6)zip 7)phone 8)email ");
                System.out.println("select the options:");
                int choice = a.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("firstname:");
                        String firstname = a.nextLine();
                        array.get(i).setFirstname(firstname);
                        break;
                    case 2:
                        System.out.println("lastname:");
                        String lastname = a.nextLine();
                        array.get(i).setLastname(lastname);
                        break;
                    case 3:
                        System.out.println("Address:");
                        String address = a.nextLine();
                        array.get(i).setAddress(address);
                        break;
                    case 4:
                        System.out.println("City:");
                        String city = a.nextLine();
                        array.get(i).setCity(city);
                        break;
                    case 5:
                        System.out.println("State:");
                        String state = a.nextLine();
                        array.get(i).setState(state);
                        break;
                    case 6:
                        System.out.println("Zip:");
                        int zip = a.nextInt();
                        array.get(i).setZip(zip);
                        break;
                    case 7:
                        System.out.println("Phone:");
                        int phone = a.nextInt();
                        array.get(i).setPhone(phone);
                        break;
                    case 8:
                        System.out.println("Email:");
                        String email = a.nextLine();
                        array.get(i).setEmail(email);
                        break;
                }}}
    }
    public static void delete(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter first name to get it deleted: ");
        String ename = a.next();
        for(int i=1;i<=8;i++){
            if(array.get(i).getFirstname().equals(ename)){
                array.remove(i);
            }
        }
    }



    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Options : 1)add  2)edit  3)delete 4)display ");
        int option = s.nextInt();
        switch (option) {
            case 1:
                add();
                break;
            case 2:
                edit();
                break;
            case 3 : delete();
                break;
            case 4 : display();
                break;
        }
    }
}
