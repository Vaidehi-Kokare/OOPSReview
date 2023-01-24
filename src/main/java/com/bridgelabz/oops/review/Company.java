package com.bridgelabz.oops.review;

import java.util.Scanner;

public class Company {
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();
    void addEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int employeeID =scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter age");
        String age = scanner.next();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter department");
        String department = scanner.next();
        switch (employeeID){
            case 1:
                employee1.setName(name);
                employee1.setAge(age);
                employee1.setPhoneNumber(phoneNumber);
                employee1.setCity(city);
                employee1.setState(state);
                employee1.setDepartment(department);
                break;
            case 2:
                employee2.setName(name);
                employee2.setAge(age);
                employee2.setPhoneNumber(phoneNumber);
                employee2.setCity(city);
                employee2.setState(state);
                employee2.setDepartment(department);
                break;
            case 3:
                employee3.setName(name);
                employee3.setAge(age);
                employee3.setPhoneNumber(phoneNumber);
                employee3.setCity(city);
                employee3.setState(state);
                employee3.setDepartment(department);
                break;
        }
    }
}
