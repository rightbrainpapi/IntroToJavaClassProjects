/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycheck;

/**
 *
 * @author d.ahuemaen
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

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter hours worked and the rate of pay: ");
        hours = sc.nextDouble();
        rate = sc.nextDouble();
        
        
        gross = hours * rate;
        net = gross - TAX;
        
        System.out.printf("The gross pay is: $%.2f%n", gross);
        System.out.printf("The gross pay is: $%.2f%n", net);
        
        
        
        
    }
    
}
