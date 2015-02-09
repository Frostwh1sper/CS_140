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


import java.util.Scanner;
import java.math.BigDecimal;

public class Glenning_Invoice {
    
    public static final BigDecimal gas_87 = new BigDecimal("2.47");
    public static final BigDecimal gas_89 = new BigDecimal("2.58");
    public static final BigDecimal gas_91 = new BigDecimal("2.61");
    public static final BigDecimal countyTax = new BigDecimal("0.07");
    public static final BigDecimal cityTax = new BigDecimal("0.0375");
    public static final BigDecimal memberDiscount = new BigDecimal("0.1");

    public static void main(String[] args) {
        
        // Initiate Scanner
        Scanner userInput = new Scanner(System.in);
        
        //Declare and initialize variables
        BigDecimal price = new BigDecimal("0");
        BigDecimal subtotal;
        BigDecimal total;
        
        //User inputs
        System.out.print("Are you a member? (yes or no) ");
        String membership = userInput.nextLine();
        System.out.print("What quality gas (87, 89, 91): ");
        int quality = userInput.nextInt();
        System.out.print("Gallons sold: ");
        BigDecimal quantity = new BigDecimal(userInput.nextInt());
        
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
            price = price.subtract(memberDiscount);
        }
        subtotal = price.multiply(quantity);
        BigDecimal countyTaxAmt = subtotal.multiply(countyTax);
        BigDecimal cityTaxAmt = subtotal.multiply(cityTax);
        total = subtotal.setScale(2, BigDecimal.ROUND_HALF_UP);
        total = total.add(countyTaxAmt.setScale(2, BigDecimal.ROUND_HALF_UP));
        total = total.add(cityTaxAmt.setScale(2, BigDecimal.ROUND_HALF_UP));
        
        
        //Print invoice
        System.out.print(String.format("\n\n%27s\n", "INVOICE FOR GASOLINE"));
        System.out.print(String.format("%20s: %s\n", "Member status", membership));
        System.out.print(String.format("%20s: %s @ $%s\n\n", "Gasoline Sold/Price", quantity, price.setScale(2, BigDecimal.ROUND_HALF_UP)));
        System.out.print(String.format("%20s: $%7s\n", "Subtotal", subtotal.setScale(2, BigDecimal.ROUND_HALF_UP)));
        System.out.print(String.format("%20s: $%7s\n", "County Tax", countyTaxAmt.setScale(2, BigDecimal.ROUND_HALF_UP)));
        System.out.print(String.format("%20s: $%7s\n", "City Tax", cityTaxAmt.setScale(2, BigDecimal.ROUND_HALF_UP)));
        System.out.print(String.format("%20s--------------\n", " "));
        System.out.print(String.format("%20s: $%7s\n", "Total", total));
        
    }
    
}
