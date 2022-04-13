package Project1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class BankAccount {
    private double balance;
    Scanner keyboard = new Scanner(System.in);
    public int getBalance;

    
    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance){
        balance = initalBalance;
    }


    public double getBalance(){
        return balance;
    }

 //test
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
        

        
    }

    public void overDraft(BankAccount bank, double amount) {
        if (amount >= bank.getBalance()) {
            System.out.println(
                    "You're withdrawing more than your balance, your account balance will be 0 or less, do you wish to continue? ");
            System.out.println("Y or N?");
            {
                {

                    String input = keyboard.next();
                    if (input.equals("Y")) {
                        bank.withdraw(amount);
                        System.out.println("Amount: $" + amount + " Was Withdrawn");

                        System.out.println("Total Balance: $" + bank.getBalance());
                    }

                    else if (input.equals("N")) {
                        System.out.print("Ok, Have a nice day!");

                    }
                }
            }
        } else if (amount <= bank.getBalance()) {

            bank.withdraw(amount);

            System.out.println("Amount: $" + amount + " Was Withdrawn");
            System.out.println("Total Balance: $" + bank.getBalance());
        }
    }
  

    public void monthlyfee(){
        withdraw(10);
    }




    public void simpleInterest(double p, double r, double d){

        double amount  = (p*r*d)/100;


            System.out.println("Simple Interest is: " + amount);
        
        
        }

       
            
        




    // P(1+ R/n)^(nt) - P 
    // P = principal
    // t = years
    // R = annual interest rate
    // n = # of times its compunded
    // PEMDAS 
    public void calcInterest(double p, int t, double r, int n){
        double amount =  p * Math.pow(1 + (r/n), n*t);
        double compinterest = amount - p;
        System.out.println("Compund Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t +" years: "+ amount);
    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        /************************ */
        System.out.println("Please select and option:");
        System.out.println("-------------------------");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Compund Interest");
        System.out.println("5: Simple Interest");
        System.out.println("6: Transfer");
        System.out.println("0: Quit");
        System.out.println("-------------------------");

        selection = input.nextInt();


        return selection;


    }





}
