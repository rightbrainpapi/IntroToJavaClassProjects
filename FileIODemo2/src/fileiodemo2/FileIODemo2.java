/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiodemo2;

/**
 *
 * @author d.ahuemaen
 */


import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class FileIODemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (new File ("roster.tx"));
        PrintStream ps = new PrintStream("grades.tx");
        int total = 0, maxAverage =0, numStudents = 0;
        
        while (scanner.hasNext()){
            String name = scanner.next();
            int average = scanner.nextInt();
            
            char grade = averageToGrade(average);
            
            ps.println(name + ": " + grade + " (" + average + ")");
            
            if (average > maxAverage){
                maxAverage = average;
            }
            
            total  += average;
            numStudents++;
            
        }
        ps.println();
        ps.println( "Class Average:" + (total / numStudents));
        ps.println("Highest individual average:" +  maxAverage);         
    }

          public static char averageToGrade(int average){
                    
            if (average >= 90){
                return 'A';
            }
             if (average >= 80){
                return 'A';
            }
              if (average >= 70){
                return 'A';
            }
               if (average >= 60){
                return 'A';
            }
            return 'F';
          }
    
    
    
    
    
}
