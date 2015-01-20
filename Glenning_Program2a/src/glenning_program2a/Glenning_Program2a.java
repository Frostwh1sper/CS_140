/*
 * file: Glenning_Program2a.java
 * author: P. Glenning
 * class: CS 140 - Introduction to Computer Science
 * 
 * assignment: Program 2a
 * date last modified: 20 Jan 2015
 * 
 * purpose: Accepts user inputs, converts Imperial measurements to metric,
 *          then displays converted value.
 * 
 */
package glenning_program2a;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Glenning_Program2a {

    public static void main(String[] args) {
        //Initiate Scanner and DecimalFormat
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");

        // Declare and initialize variables
        double totalMeters;
        double totalFeet = 0;
        
        //User inputs
        System.out.print("\nEnter miles: ");
        int miles = userInput.nextInt();
        System.out.print("\nEnter feet: ");
        int feet = userInput.nextInt();
        System.out.print("\nEnter inches: ");
        int inches = userInput.nextInt();
        
        //Calculations
        totalFeet += (miles * 5280);
        totalFeet += feet;
        totalFeet += (inches/12.0);
        totalMeters = (totalFeet/3.3);
        
        
        //Display results
        System.out.println(miles + " mile(s), " + feet + " feet, " + inches + " inch(es) converts to " + df.format(totalMeters) + " meters.");
    }
    
}
