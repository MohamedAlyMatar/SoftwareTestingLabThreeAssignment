import java.lang.*;
import java.util.Scanner;


public class ATMachine {
    static Scanner scan = new Scanner(System.in);
    private double balance, withdrawal, deposit;

    public ATMachine(){
        this.balance=0;
        this.withdrawal=0;
        this.deposit=0;
    }

    public double getBalance(){return balance;}
    public double getWithdrawal(){return withdrawal;}
    public double getDeposit(){return deposit;}

    public String ActionsTaken(){
        System.out.println("Account Balance = " + getBalance() +
                "\nWithdrawaled balance = " + getWithdrawal() +
                "\nDeposited balance = " + getDeposit());

        return( "Account Balance = " + getBalance() +
                "\nWithdrawaled balance = " + getWithdrawal() +
                "\nDeposited balance = " + getDeposit());
    }

    public String setDeposit(double DepositAmount){
        System.out.println("\nPlease wait...");
        this.deposit += DepositAmount;
        this.balance += DepositAmount;
        System.out.println("Deposit Completed.");
        return ("Deposit Completed.");
    }

    public String setWithdrawal(double WithdrawalAmount){
        if(WithdrawalAmount < getBalance())
        {
            System.out.println("\nPlease wait...");
            this.withdrawal += WithdrawalAmount;
            this.balance -= WithdrawalAmount;
            System.out.println("Withdrawal Completed.");
            return ("Withdrawal Completed.");
        }
        else
        {
            System.out.println("Please make sure to have enough balance for the withdrawal operation or make a deposit.");
            return ("Please make sure to have enough balance for the withdrawal operation or make a deposit.");
        }
    }

    public void selectOperation()
    {
        System.out.println("\n----------------------" +
                           "\nSelect Operation:" +
                           "\n----------------------" +
                           "\nOption 1:  Deposit " +
                           "\nOption 2:  Withdrawal " +
                           "\nOption 3:  Cancel " +
                           "\n----------------------");

        char Operation = scan.next().charAt(0);
        switch(Operation){
            case '1':
                System.out.println("\nEnter the amount of money to deposit\n");
                double DepositAmount = CoffeeMachine.scan.nextDouble();
                this.setDeposit(DepositAmount);
                break;
            case '2':
                System.out.println("\nEnter the amount of money to withdrawal, (100 < amount of money < 500)\n");
                double WithdrawalAmount = CoffeeMachine.scan.nextDouble();
                this.setWithdrawal(WithdrawalAmount);
                break;
            case '3':
                break;
        }
    }

    public void start()
    {
        boolean powerON = true;
        while(powerON)
        {
            System.out.println("\n-------------------------------- " +
                    "\nSelect what you want to do" +
                    "\n-------------------------------- " +
                    "\nChoice 1: Check Account Status " +
                    "\n-------------------------------- " +
                    "\nChoice 2: Withdrawal or Deposit " +
                    "\n-------------------------------- " +
                    "\nChoice 3: Exit " +
                    "\n-------------------------------- \n");

            System.out.println("Enter your Choice: ");
            char choice = CoffeeMachine.scan.next().charAt(0);
            switch(choice){
                case '1':
                    this.ActionsTaken();
                    break;
                case '2':
                    this.selectOperation();
                    break;
                case '3':
                    System.out.println("\nExiting...");
                    powerON = false;
                    break;
            }
        }
    }
}

class UseATM
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDo you want to start?, Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if(d == 'Y' || d == 'y')
        {
            ATMachine atm = new ATMachine();
            atm.start();
            System.out.println("Ejecting card...\n");
        }
        else
            System.out.println("Ejecting card...\n");
    }
}
