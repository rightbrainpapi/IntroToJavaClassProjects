package planets;

/**
 *
 * @author Darnell Simon
 * 
 * DESCRIPTION:
 * This Java program calculates the Gravitational Potential Energy between 
 * various planets and the sun. The program should prints the message:
 * The Gravitational Potential Energy between (Planet) and the sun, at a 
 * distance of (distance) meters is (mass) N M^2/KG^2.
 * I've used the trailer method to signal the end of data 
 * 
 * CHALLENGES
 * The biggest challenge was figuring out how to formate the big decimal.
 * I used stack overflow in order to come up with a clean enough solution.
 * Moving forward the I can abstract the the big decimal formatter 
 * so that it is reusable for other numbers not just the GPE.
 *
 * SUCCESSES
 * In working through the challenge of formatting the big decimal I learned more
 * about the variety of packages that can be imported. In general I am very 
 * proud of of my accomplishment.
 */

// Pacakage Impports
import java.io.PrintStream; //import PrintStream class
import java.util.Scanner;
import java.math.*;

//Body of Program
public class Planets {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream("planetOutput.txt");
        
        promptUser();

        // Declaring the variables
        final double SUNMASS = 1.989E+30;
        final double UNIVERSALGRAVITATIONALCONSTANT  = -6.67E-11;
        String planet;
        double planetMass, distance, gravPotential; 

        // Initializing a planet variable
        planet = sc.next();

        while(!planet.equals(0000)){
            // Run program

            // Initialize the variables
            planetMass = sc.nextDouble();
            distance = sc.nextDouble();

            //Calculating the Gravitational Potential Energy
            gravPotential = (UNIVERSALGRAVITATIONALCONSTANT * SUNMASS * planetMass)/(distance);

            //////////////////////////////////////////////
            // Gravitational Potential Energy Formatter //
            //////////////////////////////////////////////

            // Create a BigDecimal object 
            BigDecimal myformattedGPE; 

            // Set precision to 5 
            MathContext mc  = new MathContext(5); 
            myformattedGPE = new BigDecimal(gravPotential, mc); 

            ///////////////////////////////////////////////////
            // End: Gravitational Potential Energy Formatter //
            ///////////////////////////////////////////////////
            //Printing Calculation
            ps.print("\nThe Gravitational Potential Energy between ");
            ps.print( planet + " and the Sun, at a distance of ");
            ps.print( distance +  " Meters is " + myformattedGPE +" N M^2/Kg^2.\n");

            promptUser();
            
        } 
    }
    
    //THIS METHOD PROMPTS THE USER FOR THE REQUIRED INFO
    public static void promptUser(){
            // Print the Instructions for next incoming data
            System.out.println("\nPlease enter the following: ");
            System.out.print("(1)name of a planet,");
            System.out.print("(2) the mass of the planet,");
            System.out.println("(3) & the distance of the planet from the sun. \n");
            System.out.println("Example: Earth 5.972E+24 149.6E+9 \n");
            System.out.println("Enter four zeros to stop.\n"); 
    }
    
    
    //THIS METHOD FORMMATTES THE BIG DECIMALS
    //    public static void bigDecimalFormatter(){
    //    
    //    // return the formatted 
    //    }
}
