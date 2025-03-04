package HW2;

import java.util.Scanner;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.



    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 





    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    
 


    // you do not need this main if you want to make a tester class
     public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
     
            System.out.println("Enter any number");

            double a = input.nextDouble();
     
            System.out.println("Enter any other number");



            double b = input.nextDouble();


            double c1 = Math.pow(a,2) + Math.pow(b,2);
     
            double c2 = Math.sqrt(c1);
     
            // Use System.out.printf for this println statement.
            // This is the other assignment


            System.out.println("Square root of: " + a + "^2 " + " + " + b + "^2 " + "= " + c2);
              
              System.out.println("Enter your grade");


              double grade = input.nextDouble();
              double gradeCeil = Math.ceil(grade);
              
              if(grade >=95)
                  System.out.println("A++");
              else if(gradeCeil >= 90 && gradeCeil <= 95)
                  System.out.println("A-");
              else if(gradeCeil <= 89 && gradeCeil >= 85)
                  System.out.println("B+");
              else if(gradeCeil < 85 && gradeCeil >= 80)
                  System.out.println("B-");
              else if(gradeCeil < 79 && gradeCeil >= 75)
                  System.out.println("C+");
              else if(gradeCeil < 75 && gradeCeil >= 70)
                  System.out.println("C-");
              else if(gradeCeil <= 69 && gradeCeil >= 65)
                  System.out.println("D+");
              else if(gradeCeil < 65 && gradeCeil >= 61)
                  System.out.println("D");
              else
                  System.out.println("F");




                  // Final Question
     
            System.out.println("Enter total bill");
              double totalBill = Math.ceil(input.nextDouble());
              
              System.out.println("Enter total number of people splitting the bill");
              int numofPpl = input.nextInt();
              
              System.out.println("Enter the percentage to tip");
              double percent2Tip = input.nextDouble();
              double percentAge = percent2Tip / 100;
     
            
     
            
            
         }
     
     
    }





