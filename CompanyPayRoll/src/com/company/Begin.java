/*
Author: J White
Date: 4/3/2019 - 4/4/2019
Task: Create a fake company
-Give company 2 different Employees (manager, cashier)
-Use Employee as an abstract class
-Employees will share String name, int employeeId fields
-Manager is a salaried employee, cashier is an hourly employee
-As a user, I want the ability to calculate each employee's weekly pay

*HINT:*
-The user is asked to input the number of hours the cashier worked, then weekly pay is calculated.
-The hours worked per week is irrelevant for a salaried employee, who is always paid the same amount.

-Each class should have a constructor and a weeklyPay method. Only the abstract Employee class will have getters/setters
-Create a design based on these requirements (doesn't have to be super detailed), create a Trello ticket ("Employee Design - <your name>"), and post them there
-Ask any questions you might have!

-----------------------------------------------------------------------------------------

*Scanner flow should be something like this:*
**If Cashier**
Employee name:
Employee Id:
Employee Type:
Hourly Rate:
Hours Worked:
(Upon hitting enter, this should display employee's info *see attached screenshot)

**If Manager**
Employee name:
Employee Id:
Employee Type:
Annual Salary:
(Upon hitting enter, this should display employee's info *see attached screenshot)
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
//        System.out.println("Welcome to the Busy Bee Personnel Computing HR Management System!!");
        System.out.println("Welcome to the Busy Bee Personnel Computing System!!");
        System.out.println("");

        // creates and displays option to add a manager or a cashier to the system
        System.out.println("We see that you would like to add another worker to our growing hive.");
        System.out.println("Please choose from the following options below:");
        System.out.println("");

        System.out.println("M - Manager");
        System.out.println("C - Cashier");
        System.out.println("");

        // User enters the type of employee they would like to add.
        System.out.println("Please enter M or Manager for manager and C or Cashier for cashier.");
        System.out.print("Whom would you like to add? Enter your choice: ");

        // Takes in user input (choice) then will take them to the Manager question section, Cashier
        // question section or exits the program
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
                    break;
                default:
                    // will print out a thank you / exit message to user if incorrect input is given
                    System.out.println("Thank you for using the Busy Bee PC System! Goodbye " +
                            "and have an un-Bee-lieveably sweet day!");
                    break;

            }// end of switch

        // will continue to run the program until the user enters an 'N' or 'n' or nothing
        System.out.print("");
        System.out.print("Would you like to add another worker bee to our thriving hive? Y/N ");
            ans = scanner.nextLine().toString().toLowerCase();
        System.out.println("");

            while ((!ans.equals("n")) && (!ans.equals("")))
            {
//                System.out.println("");
                begin();
            }//end of while loop

        // once N or " " is submitted by the user, the program will print out a thank you --
        // exit message to user
//        System.out.println("Thank you! Goodbye!");
        System.out.println("Thank you for using the Busy Bee PC System! Goodbye " +
                "and have an un-Bee-lieveably sweet day!");

    }// END of begin() method

}// End of Begin Class