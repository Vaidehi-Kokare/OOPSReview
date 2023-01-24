package com.bridgelabz.oops.review;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter company ID");
        int companyID = scanner.nextInt();
        switch (companyID) {
            case 1:
                Company company1 = new Company();
                company1.addEmployee();
                break;
            case 2:
                Company company2 = new Company();
                company2.addEmployee();
                break;
            case 3:
                Company company3 = new Company();
                company3.addEmployee();
                break;
        }
    }
}
