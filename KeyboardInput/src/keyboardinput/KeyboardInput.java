/*
 *      file: KeyboardInput.java
 *      author: P. Glenning
 *      class: CS 140: Introduction to Computer Science
 * 
 *      assignment: Lab #2
 *      date last modified: 4 Feb 2015
 * 
 *      purpose: Using user inputs, print a string containing said inputs.
 * 
 */
package keyboardinput;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {
        
        // Initialize Scanner
        Scanner userInput = new Scanner(System.in);
        
        // User inputs
        System.out.print("Enter your name: ");
        String userName = userInput.nextLine();
        System.out.print("Enter your age: ");
        int userAge = userInput.nextInt();
        System.out.print("What company do you want to work for? ");
        String companyName = userInput.next();
        
        // Generate string
        String sentence = String.format("\n\nMy name is %s, my age is %d and I hope to work for %s.", userName, userAge, companyName);
        
        // Output string
        System.out.println(sentence);
        
    }
    
}
