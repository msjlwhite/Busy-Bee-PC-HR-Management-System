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

public class Begin {

    // Class Variable Declaration
    Cashier c = new Cashier();                  // declaration of a cashier class object
    Manager m = new Manager();                  // declaration of a manager class object
    Scanner scanner = new Scanner(System.in);   // declaration of a Scanner class object
    String opt;                                 // variable to hold user input for employee type
    String ans;                                 // variable to allow the program to stop or continue running

    // method that will start the program
    public void begin()
    {
        // generates a welcome message to greet the user
        System.out.println("Welcome to the Busy Bee Personnel Computing HR Management System!!");
        System.out.println("");

        // creates and displays option to add a manager or a cashier to the system
        System.out.println("We see that you would like to add another worker to our growing hive.");
        System.out.println("Please choose from the following options below:");
        System.out.println("");

        System.out.println("M - Manager");
        System.out.println("C - Cashier");
        System.out.println("");


        System.out.print("Your choice: ");
        opt = scanner.nextLine().toString().toLowerCase();

            switch (opt) {
                case "m":
                    m.managerInfo();
                    break;
                case "manager":
                    m.managerInfo();
                    break;
                case "c":
                    c.cashierInfo();
                    break;
                case "cashier":
                    c.cashierInfo();
                default:
                    System.out.println("Thank you! Goodbye!");
                    break;

            }// end of switch

        // will continue to run the program until the user enters an 'N' or 'n'
        System.out.print("");
        System.out.print("Would you like to add another worker bee to the thriving hive? Y/N ");
            ans = scanner.nextLine().toString().toLowerCase();

            while (!ans.equals("n"))
            {
                begin();
            }//end of while loop

    }// END of begin() method

}// End of Begin Class