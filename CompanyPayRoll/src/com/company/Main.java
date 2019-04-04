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

Updated Specs as of 4/4/2019
Scanner flow should be something like this:
If Cashier
Employee name:
Employee Id:
Employee Type:
Hourly Rate:
Hours Worked:
(Upon hitting enter, this should display employee's info *see attached screenshot)

If Manager
Employee name:
Employee Id:
Employee Type:
Annual Salary:
(Upon hitting enter, this should display employee's info *see attached screenshot)

*/

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //creates an triggers program to start up
        Begin start = new Begin();
        start.begin();
    }
}
