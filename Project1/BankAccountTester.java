package Project1;

import java.util.Scanner;



public class BankAccountTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello Welcome! Please Enter your Name:");


        BankAccount gregChecking = new BankAccount(20000);


        String name = keyboard.nextLine();
        System.out.println("Welcome " + name + ", How much would you like start your account with?");
        double startAmount = keyboard.nextDouble();
        BankAccount name_checking = new BankAccount(startAmount);

        System.out.println("Great! "+ name+" Your starting balance is: $"+ name_checking.getBalance());
        
        int menuSelection = BankAccount.menu();
        System.out.println(menuSelection);
        
        if(menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+name_checking.getBalance());
             if (startAmount >= 10000 ){
                System.out.println("You have a balance greater than or equal to $10,000, would you like to start a savings account?");
                String answer = keyboard.nextLine();{

                
                if (answer == "y"){
                    System.out.println("Enter the interest rate");
                    double interestRateValue = keyboard.nextDouble();
                    System.out.println("Enter the amount of time in years");
                    double time = keyboard.nextDouble();
                    double compoundIntval = startAmount * Math.pow(1 +(interestRateValue/4), 4*time);
                    System.out.println("The compound interest value is $" + compoundIntval);
                }

                else if(answer == "n"){
                    System.out.println("Total Balance: $"+name_checking.getBalance());


                }
                }



             }


            
        }else if (menuSelection == 2){
            System.out.println("Please enter the amount to deposit");
            double depositAmount = keyboard.nextDouble();
            name_checking.deposit(depositAmount);
            System.out.println("Amount: $"+depositAmount + " Was Deposited");
            System.out.println("Total Balance: $" + name_checking.getBalance());




        }else if (menuSelection == 3){
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount = keyboard.nextDouble();
            name_checking.overDraft(name_checking, withdrawAmount);
            if (name_checking.getBalance <= 0) {
                System.out.println("An additonal $35 will be charged if you withdraw.");
                double additionalFee = name_checking.getBalance() - 35;
                System.out.println("Total Balance: $" + additionalFee );

                




            }

                
        }else if(menuSelection == 4){

            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.calcInterest(name_checking.getBalance(), years, 0.15, 12);


    
        }

    else if(menuSelection == 5){
        System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.simpleInterest(name_checking.getBalance(), 0.15, years);

        }

    else if(menuSelection == 6){
            System.out.println("How much would you like to Transfer to Greg's Account?");
                int years = keyboard.nextInt();
                name_checking.simpleInterest(name_checking.getBalance(), 0.15, years);
                double withdrawAmount = keyboard.nextDouble();

                if (startAmount < withdrawAmount) {
                    System.out.println("Unable to Transfer Amount");
                }
                else if(startAmount >= withdrawAmount){
                    System.out.println("Amount: $" + withdrawAmount + "has been transfered to Account 2");
                    double FinalBalance = startAmount - withdrawAmount;
                    System.out.println("Your account now has the balance of : $" +FinalBalance);
                    gregChecking.deposit(withdrawAmount);
                    System.out.println("Your second account now has a balance of: $" + gregChecking.getBalance());




                }





    }


        else if (menuSelection == 0){
            System.out.println("Have a nice day!");
        }else{
            System.out.println("Error: No Valid Selection");
        }
    }


    private static void simpleInterest(double balance, int years, double d, int i) {
    }
}
