/*
 *      file: HelloWorld.java
 *      author: P. Glenning
 *      class: CS 140-03 - Introduction to Computer Science
 *      
 *      assignment: program 1
 *      date last modified: 1/9/2015
 *
 *      purpose: "Hello World," my name, my favorite video game, favorite film, and favorite 
 *      song and who performed it are printed to the screen
 *
*/

package helloworld;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare and initialize variables
        String message = " Hello world! "
                + "\n Here are some of Patrick Glenning's favorite things:\n "
                + "\n   1. Video Game "
                + "\n      Star Citizen"
                + "\n   2. Film"
                + "\n      Guardians of the Galaxy"
                + "\n   3. Song"
                + "\n      Chip - The Real McKenzies";
        
        //Print message to the screen
        System.out.println(message);
    }
    
}
