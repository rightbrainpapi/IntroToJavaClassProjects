/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework0;

/**
 *
 * @author Darnell Simon
 * @since 1/28/2020
 *
 * Description: This is my first homework. It was fairly simple but I do expect
 * to run into some challenges.
 * 
 * What is the program suppose to do?
 *      -The program should take the first Name & Last Name and save 
 *          it in a variable.
 *      -Then print the string "This is my first program" plus the first and 
 *          last name variables.
 * 

 */


//Importing packages that we need
import java.util.Scanner;

public class HomeWork0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaring the variables
        String first, last;

        //Instatiating the object sc of the Scanner class 
        Scanner sc = new Scanner(System.in);
        
        //Printing two Phrases        
        System.out.println("Please enter your first and last name.");
        System.out.println("Do not forget to press the ENTER key.");

        //Setting the variable       
        first = sc.next();
        last = sc.next();
        
        //Printing two phrases using print line and concatinate the first & last
        System.out.println("\nThis is my first program!");
        System.out.println("My name is: " + first + " " + last);
    }

}
