/*
 * file: Glenning_MadLibs.java
 * author: P. Glenning
 * class: CS 140 - Introduction to Computer Science
 * 
 * assignment: Program 4
 * date last modified: 24 Feb 2015
 * 
 * purpose: Accepts user inputs, writes inputs to a file, then prints a mad lib story from read files
 * 
 */
package glenning_madlibs;

import java.util.Scanner;
import java.io.*;

public class Glenning_MadLibs {

    public static void main(String[] args) throws IOException {
        
        // Initialize Input Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Create string variables
        String str;
        String usrStr;
        
        // Create output file
        PrintWriter outputFile = new PrintWriter("Mad Lib Words.txt");
        
        // Accept file name from user input
        System.out.println("Enter a file name: ");
        String fileName = userInput.nextLine();
        
        // Open read file
        File file = new File(fileName);
        Scanner madLibFile = new Scanner(file);
        
        // User inputs for the Mad Lib
        System.out.println("Please provide a word for each of the following:");
        int num = madLibFile.nextInt();
        madLibFile.nextLine();
        for(int i = 0; i < num; i++){
            str = madLibFile.nextLine();
            System.out.println(str);
            outputFile.println(userInput.nextLine());
            System.out.print("\n");
        }
        
        // Close user input file
        outputFile.close();
        
        // Open user input file as read file
        File userFile = new File("Mad Lib Words.txt");
        Scanner uFile = new Scanner(userFile);
        
        // Print the Mad Lib
        do{
            str = madLibFile.nextLine();
            System.out.print(str);
            if(uFile.hasNext()){
                usrStr = uFile.nextLine();
                System.out.print(usrStr);
            }
        }while(madLibFile.hasNext());
        
    }
    
}