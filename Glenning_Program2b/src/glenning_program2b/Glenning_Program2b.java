/*
 * file: Glenning_Program2a.java
 * author: P. Glenning
 * class: CS 140 - Introduction to Computer Science
 * 
 * assignment: Program 2b
 * date last modified: 22 Jan 2015
 * 
 * purpose: Accepts user inputs, converts metric measurements to Imperial,
 *          then displays converted value.
 * 
 */
package glenning_program2b;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Glenning_Program2b {
    
    public static void main(String[] args) {
        // Initiate Scanner and DecimalFormat
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        
        // Declare and initialize variables
        float totalFeet;
        int miles=0;
        int feet=0;
        float inches;
        
        // User inputs
        System.out.print("Enter meters: ");
        float meters = userInput.nextFloat();
        
        //Calculations
        totalFeet = meters * 3.3f;
        while(totalFeet >= 5280){
            miles +=1;
            totalFeet -= 5280;
        }
        while(totalFeet >= 1){
            feet += 1;
            totalFeet -= 1;
        }
        inches = totalFeet * 12f;
        
        // Display results
        System.out.print(meters + " meters converts to " + miles + " mile(s), " + feet + " feet, " + df.format(inches) + " inch(es).");
        
    }
    
}
