/*
 *      file: HelloWorld.java
 *      author: P. Glenning
 *      class: CS 140-03 - Introduction to Computer Science
 *      
 *      assignment: program 1
 *      date last modified: 1/13/2015
 *
 *      purpose: "Hello World," my name, my favorite video game, favorite film, and favorite 
 *      song and who performed it are printed to the screen
 *
*/

public class Glenning_Program1 {
    public static void main(String[] args) {
        
        // Instance Variables
        String message = " Hello world! "
                + "\n Here are some of Patrick Glenning's favorite things:\n "
                + "\n   1. Video Game "
                + "\n      Star Citizen"
                + "\n   2. Film"
                + "\n      Guardians of the Galaxy"
                + "\n   3. Song"
                + "\n      Chip - The Real McKenzies";
        
        //Main Method
        System.out.println(message);
    }
}
