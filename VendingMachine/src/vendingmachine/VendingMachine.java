/*
 *      file: VendingMachine.java
 *      author: P. Glenning
 *      class: CS 140: Introduction to Computer Science
 * 
 *      assignment: Lab #2
 *      date last modified: 4 Feb 2015
 * 
 *      purpose: Determines the change to be dispensed from a vending machine
 * 
 */
package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        
        // Initialize Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Declare and initialize variables
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        
        // User inputs
        System.out.print("Enter price of item\n(from 25 cents to a dollar, in 5-cent increments): ");
        int cost = userInput.nextInt();
        
        // Calculations
        int change = 100 - cost;
        while(change >= 25){
            quarters ++;
            change -= 25;
        }
        while(change >= 10){
            dimes ++;
            change -= 10;
        }
        while(change >= 5){
            nickels ++;
            change -= 5;
        }
        
        String result = String.format("\nYou bought an item for %d cents and gave me a dollar, \nSo your change is \n%d quarter(s), \n%d dime(s), and \n%d nickel(s).", cost, quarters, dimes, nickels);
        
        // Display results
        System.out.println(result);
        
    }
    
}
