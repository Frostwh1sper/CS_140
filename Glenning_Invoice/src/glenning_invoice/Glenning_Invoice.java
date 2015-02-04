/*
 * file: Glenning_Program2a.java
 * author: P. Glenning
 * class: CS 140 - Introduction to Computer Science
 * 
 * assignment: Program 3
 * date last modified: 29 Jan 2015
 * 
 * purpose: Accepts user inputs, calculates price and outputs invoice
 * 
 */
package glenning_invoice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Glenning_Invoice {

    public static void main(String[] args) {
        // Initiate Scanner and DecimalFormat
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        //Declare and initialize variables
        float gas_87 = 2.47f;
        float gas_89 = 2.58f;
        float gas_91 = 2.61f;
        float countyTax = 0.07f;
        float cityTax = 0.0375f;
        float price=0;
        float subtotal;
        float total;
        
        //User inputs
        System.out.print("Are you a member? (yes or no) ");
        String membership = userInput.nextLine();
        System.out.print("What quality gas (87, 89, 91): ");
        int quality = userInput.nextInt();
        System.out.print("Gallons sold: ");
        int quantity = userInput.nextInt();
        
        //calculations
        if(quality == 87){
            price = gas_87;
        }
        if(quality == 89){
            price = gas_89;
        }
        if(quality == 91){
            price = gas_91;
        }
        if(membership.equals("yes")){
            price -= 0.1f;
        }
        subtotal = price * quantity;
        float countyTaxAmt = (subtotal * countyTax);
        float cityTaxAmt = (subtotal * cityTax);
        total = (subtotal + countyTaxAmt + cityTaxAmt);
        
        //Print invoice
        System.out.print(String.format("\n\n%27s\n", "INVOICE FOR GASOLINE"));
        System.out.print(String.format("%20s: %s\n", "Member status", membership));
        System.out.print(String.format("%20s: %s @ $%s\n\n", "Gasoline Sold/Price", quantity, df.format(price)));
        System.out.print(String.format("%20s: $%7s\n", "Subtotal", df.format(subtotal)));
        System.out.print(String.format("%20s: $%7s\n", "County Tax", df.format(countyTaxAmt)));
        System.out.print(String.format("%20s: $%7s\n", "City Tax", df.format(cityTaxAmt)));
        System.out.print(String.format("%20s--------------\n", " "));
        System.out.print(String.format("%20s: $%7s\n", "Total", df.format(total)));
        
    }
    
}
