/*
 *      file: IsEven.java
 *      author: P. Glenning
 *      class: CS 140: Introduction to Computer Science
 * 
 *      assignment: Lab #2
 *      date last modified: 4 Feb 2015
 * 
 *      purpose: Verifies whether user input is either odd or even and is within given range, else return error
 * 
 */
package iseven;

import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        
        boolean evenOdd = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer from 0-10: ");
        int n = keyboard.nextInt();
        
        // Determine whether odd or even
        if (n % 2 == 0){
            evenOdd = true;
        }
        
        // Print determination
        if(n < 0 || n > 10){
            System.out.println("Error: Invalid integer input");
        }
        else {
            System.out.println("Is that number even? " + evenOdd);
        }
        
    }
    
}
