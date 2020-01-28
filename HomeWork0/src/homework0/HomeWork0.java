/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework0;

/**
 *
 * @author Darnell Simon
 */

import java.util.Scanner;

public class HomeWork0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first, last;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first and last name.");
        System.out.println("Do not forget to press the ENTER key.");

        first = sc.next();
        last = sc.next();

        System.out.println("\nThis is my first program!");
        System.out.println("My name is: " + first + " " + last);
    }
    
}
