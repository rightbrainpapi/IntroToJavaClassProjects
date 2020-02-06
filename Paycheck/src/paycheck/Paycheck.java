/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycheck;

/**
 *
 * @author Darnell Simon
 * 
 * Description:
 * 
 * What is the Project?
 * 
 * 
 * WHAT DID YOU LEARN
 * 
 * I'll have to remember to always bring in the Scanner class when I am writing 
 * programs that require the program to get information from the Keyboard.
 * 
 * VARIABLE
 * Strings(ex; "this is a string"), integers(ex; 20), & doubles (ex; 25.00).
 * 
 * KEYWORDS & Variable
 *  - Final; is a keyword that declares a constant variable
 *  - double; is a keyword that holds a variable that is a decimal. 
 *  - integers;is a keyword that holds a 
 *  - string
 *  - class 
 *  - public 
 *  - new; 
 * 
 * 
 * METHODS
 *  - printf; is a method that allows you to concatenate %.2f%n 
 * 
 */

import java.util.Scanner;

public class Paycheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare variables
        final double TAX = 25.00;
        double hours, rate, gross, net;

        //Created/Instansiate the Scanner and stores it in the variable sc
        Scanner sc = new Scanner(System.in);
        
        //Tell the user to type their hours and pay rate
        System.out.println("Enter hours worked and the rate of pay: ");
        hours = sc.nextDouble(); // then save the input value in hours variable
        rate = sc.nextDouble();  // then save the input value in rate variable
        
        // Calculate the gross and net pay
        gross = hours * rate;
        net = gross - TAX;
        
        //printf allows to concatenate 
        System.out.printf("The gross pay is: $%.2f%n", gross);
        System.out.printf("The net pay is: $%.2f%n", net);
        
        
        
        
    }
    
}
