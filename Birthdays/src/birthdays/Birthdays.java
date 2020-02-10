/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdays;

/**
 *
 * @author Darnell Simon
 * 
 * Description:
 * 
 * This program is expected to take two dates (a persons date of birth 
 * and the current year) Then the program calculates the age of the person 
 * based on the given data.
 * 
 * Challenges
 * This program was fairly simple. My main challenge was getting the syntax 
 * correct for decimal inserts. 
 * 
 * 
 * KEYWORD
 *  - WHILE LOOP
 *      - starts with a condition and includes compound statements
 */


import java.util.Scanner;

public class Birthdays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaring the variables
        double birthMonth,birthYear,
               currentMonth, currentYear,
               age;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your birth month, birth year as well as");
        System.out.println("the current month followed by the current year.");
        System.out.println("Enter four zeros to stop.");
        
        birthMonth = sc.nextDouble();
        
        while(birthMonth > 0){
            birthYear = sc.nextDouble();
            currentMonth = sc.nextDouble();
            currentYear = sc.nextDouble();
            
            age = currentYear - birthYear + (currentMonth - birthMonth)/12;
            
            System.out.printf("For %.0f and %.0f your age is %.1f%n%n", 
                    birthMonth, birthYear, age);
            
        System.out.println("Please enter your birth month, birth year as well as");
        System.out.println("the current month followed by the current year.");
        System.out.println("Enter four zeros to stop.");
        
        birthMonth = sc.nextDouble();
            
        }
    }
    
}
