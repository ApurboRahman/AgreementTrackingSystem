package com.programming.murshida;

/**
 * Created by ${Apurbo} on 4/14/2018.
 */
public class EmployeeConstructor {
    int age;
    String name;

    //Default Constructor
    EmployeeConstructor() {
        age = 100;
        name = "Test1";
    }

    //Parameterized Constructor
    EmployeeConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void disp() {
        System.out.println("Name : " + name + " Age : " + age);
    }

    public static void main(String[] args) {
        EmployeeConstructor e1 = new EmployeeConstructor();
        EmployeeConstructor e2 = new EmployeeConstructor(10, "Test2");

        e1.disp();
        e2.disp();
    }
}
