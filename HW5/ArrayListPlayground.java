package HW5;


import java.util.ArrayList;


import java.util.Arrays;


import java.util.Collections;


import java.util.Scanner;



public class ArrayListPlayground {



    public static void main(String[] args) {









    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.

    int[] numArray = new int[15];


    // b) Output the value of the tenth element of the array nums.
    System.out.println(numArray[9]);

    // c) Set the value of the 5th element of the array nums to 99.

    numArray[4] = 99;

    // d) set the value of the 13th element to 15

    numArray[12] = 15;

    // d) set the value of the 2nd element to 6

    numArray[1] = 6;

    // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    


    numArray[8] = numArray[1] + numArray[12];







         
    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week

    String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday", "Sunday"}; 
    
    for (String day : days)
    {
       System.out.println(day);
    }
        
    // c) output the days of the week that we have class 
    String[] cla = {"Tuesday","Thursday"}; 


    {
       System.out.println(cla);
    }


    // d) change the arrayList to start on Sunday

    String[] sdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"}; 



    // Question 3 


    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
    // Hint 1: use collections sort to sort the numbers 
    // Hint 2: you can see if the size of the array list is divisible by 3 by running:
    //  numbers.size()%3==0
    // Hint 3: You can use this logic to print the array list in a 3x3 pattern once its created:
    // for(int i=0;i<numbers.size();i++)
    //     {
    //         System.out.print(numbers.get(i)+" ");
    //         if((i+1)%3==0)
    //         {
    //             System.out.println();
    //         }
    //     }
        
   
      final int SIZE = 7;

      
      int[] numbers = new int[SIZE];

      Scanner console = new Scanner(System.in);

      System.out.println("Enter " + SIZE + " numbers.");


      for (int i = 0; i < SIZE; i++)
      {
         numbers[i] = console.nextInt();
      }

      int sum = 0;


      for (int i = 0; i < SIZE; i++)
      {
         sum += numbers[i];
      }
      
      System.out.println("Sum of numbers: " + sum);
   }


}






   

