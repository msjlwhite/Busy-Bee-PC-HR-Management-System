/*
Author: J White
Date: 4/3/2019 - 4/4/2019
Task: Company Payroll App -- Create a fake company
-Give company 3 different Employees (manager, cashier, accountant)
-Use Employee as an abstract class
-All employees will have String name, int employeeId, double salary
-Manager is full-time employee, cashier is part-time, accountant is contract
-As a user, I want the ability to add, update, and delete employees to the fake company, calculate each employee's salary and income taxes.
-Use your own discretion on each employees hourly rate which, along with income taxes, will determine their salary
-Create a design based on these requirements (doesn't have to be super detailed), create a Trello ticket ("Employee Design - <your name>"), and post them there
-Ask any questions you might have!

*/

package com.company;

import java.util.Scanner;

//public class Manager
public class Manager extends Employee {

    //variable declaration
    double totalSal;                            // holds the result of the calculation, hourlySalary * hoursWorked
    Scanner scanner = new Scanner(System.in);   // holds the user's input and places it into the above variables

    // variable initialization
    public Manager() {
        super();                                // shows that the below variables with overwrite those from the abstract
                                                // class...?
        this.totalSal = totalSal;
    }//

    // gets new manager information
    void managerInfo() {
        System.out.println("");

        // Asks user for employee's first and last name
        System.out.print("Please enter in Employee's first and Last name: ");
        setName(scanner.nextLine().toUpperCase());

        // Asks user for employee's ID number
        System.out.print("Please enter in Employee's ID number: ");
        setEmployeeID(scanner.nextInt());

        // Asks user for employee's current rate of pay
        System.out.print("Please enter in Employee's current yearly salary: ");
        setSalary(scanner.nextDouble());

        calculateWeeklyPay();

    }//end of cashierInfo() Method

    @Override // overrides the method calculateWeeklyPay method in the abstract class with the following calculations
    // and values
    public void calculateWeeklyPay() {
        super.calculateWeeklyPay();
        totalSal = getSalary() / 40; // total weekly salary calculation
        displayManagerInfo();
    }

    // displays employee's information to user
    void displayManagerInfo() {

        System.out.println("");
        System.out.println("Please verify the Employees information below:");
        System.out.println("Job Type: MANAGER");
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Hours Worked: 40");
        System.out.println("Yearly Annual Pay: $" + String.format("%.2f", getSalary()));
        System.out.println("Weekly Pay: $" + String.format("%.2f", totalSal));
        System.out.println(getName() + " is a full-time employee.");

    }//end of displayManagerInfo()

}//end of Manager{} Class