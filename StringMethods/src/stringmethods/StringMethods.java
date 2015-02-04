/*
 *      file: StringMethods.java
 *      author: P. Glenning
 *      class: CS 140: Introduction to Computer Science
 * 
 *      assignment: Lab #2
 *      date last modified: 4 Feb 2015
 * 
 *      purpose: Accepts user inputs, then displays a story using those inputs, formatted in different ways
 * 
 */
package stringmethods;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        
        // Initialize Scanner
        Scanner userInput = new Scanner(System.in);
        
        // User inputs
        System.out.print("Please enter your first name: ");
        String firstName = userInput.next();
        System.out.print("Please enter your middle name: ");
        String middleName = userInput.next();
        System.out.print("Please enter your last name: ");
        String lastName = userInput.next();
        System.out.print("Please enter your age: ");
        int age = userInput.nextInt();
        System.out.print("Please enter your lucky number: ");
        int luckyNum = userInput.nextInt();
        System.out.print("Please enter your favorite color: ");
        String color = userInput.next();
        
        // Format strings
        String string1 = String.format("\n\nA story about %s %s %s:\n", firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(), middleName.substring(0,1).toUpperCase() + middleName.substring(1).toLowerCase(), lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());
        String string2 = String.format(" %s %s %s is %s%s%s.\n", firstName.toUpperCase(), middleName.toUpperCase(), lastName.toUpperCase(), firstName.substring(0,1).toUpperCase(), middleName.substring(0,1).toUpperCase(), lastName.substring(0,1).toUpperCase());
        String string3 = String.format(" %s%s%s's favorits color is %s, and %s %s. is %d.\n", firstName.substring(0,1).toUpperCase(), middleName.substring(0,1).toUpperCase(), lastName.substring(0,1).toUpperCase(), color.toLowerCase(), firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(), lastName.substring(0,1).toUpperCase(), age);
        String string4 = String.format(" The lucky number of %s %s. %s is %d.\n", firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(), middleName.substring(0,1).toUpperCase(), lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase(), luckyNum);
        
        // Display formatted story
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        
    }
    
}
