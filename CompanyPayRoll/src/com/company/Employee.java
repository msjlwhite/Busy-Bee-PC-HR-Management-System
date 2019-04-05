/*
Author: J White
Date: 4/3/2019 - 4/4/2019w4rd3rewet2swwesexswfdxzerQXSWASSDXSWDFDDFRGHGBVGFFFDFTRGFRTFGRETHYGFERG
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

// things that all the items/objects that will be used in the program will/does have in common are added
// can put
abstract class Employee {

    // variable declaration
    private String name;           // variable to hold the employee's name
    private int employeeID;        // variable to hold the employee's ID
    private double salary;         // variable to hold the employee's salary

    // Getter Methods - methods that will print out (relay) the information that the user enters
    // will returns the employee named entered by the user
    public String getName() {
        return name;
    }

    // will returns the employee ID entered by the user
    public int getEmployeeID() {
        return employeeID;
    }

    // will return the employee's salary (hourly or yearly) entered by the user
    public double getSalary() {
        return salary;
    }


    //Setter Methods -- method that will hold the information that user enters
    // will set the employee name to what is entered by the user
    public void setName(String name) {
        this.name = name;
    }

    // will set the employee ID to what ever is entered by the user
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // will set the employee's salary (hourly or yearly) to what ever is entered by the user
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // method that all sub-classes must use to calculate an employee's weekly pay
    //  will be overidden by what calculation is used within the sub-class
    public void calculateWeeklyPay() {}


} // end of company class

