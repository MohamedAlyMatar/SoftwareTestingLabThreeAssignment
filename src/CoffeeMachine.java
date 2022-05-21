import java.lang.*;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scan = new Scanner(System.in);
    private double coffee_powder, milk, water, french_coffee_powder;
    private int Coffee_Count = 0;

    public CoffeeMachine(){
        this.french_coffee_powder=0;
        this.coffee_powder=0;
        this.milk=0;
        this.water=0;
    }

    public double getFrench_coffee_powder(){return french_coffee_powder;}
    public double getCoffee_powder(){return coffee_powder;}
    public double getMilk(){return milk;}
    public double getWater(){return water;}

    public void setFrench_coffee_powder(double amount){this.french_coffee_powder += amount;}
    public void setCoffee_powder(double amount){this.coffee_powder += amount;}
    public void setMilk(double amount){this.milk += amount;}
    public void setWater(double amount){this.water += amount;}

    public String SetIngredient(){
        System.out.println("\nFilling...");
        setFrench_coffee_powder(500.0);
        setCoffee_powder(500.0);
        setMilk(3);
        setWater(1);
        System.out.println("Filling Completed.");
        return ("Filling Completed.");
    }
    public String GetIngredient(){
        System.out.println("Available French Coffee Power(Gram) "+ getFrench_coffee_powder());
        System.out.println("Available Coffee Power(Gram) "+ getCoffee_powder());
        System.out.println("Available Milk(Liter) "+ getMilk());
        System.out.println("Available Water(Liter) "+getWater() );

        return ("Available French Coffee Power(Gram) "+ getFrench_coffee_powder() +
                "\nAvailable Coffee Power(Gram) " + getCoffee_powder() +
                "\nAvailable Milk(Liter) " + getMilk() +
                "\nAvailable Water(Liter) " + getWater());
    }
    public String CleanMachine(){
        System.out.println("\nCleaning Machine...");
        setFrench_coffee_powder(0);
        setCoffee_powder(0);
        setMilk(0);
        setWater(0);
        System.out.println("Cleaning Completed.");
        return ("Cleaning Completed.");
    }

    private void makecoffee()
    {
        System.out.println(
                "\n-------------------" +
                        "\nSelect Type:" +
                        "\n-------------------" +
                        "\nType 1:  French Coffee " +
                        "\nType 2:  Black Coffee " +
                        "\nType 3:  Milk Coffee " +
                        "\nSelect 4:  Cancel " +
                        "\n-------------------");
        char type = scan.next().charAt(0);
        switch(type){
            case '1':
                this.FrenchCoffee();
                break;
            case '2':
                this.BlackCoffee();
                break;
            case '3':
                this.MilkCoffee();
                break;
            case '4':
                break;
        }
    }

    private void FrenchCoffee()
    {
        if(this.french_coffee_powder >= 7 && this.water >= 0.3)
        {
            System.out.println("\nMaking French Coffee...");
            System.out.println("\nTaking 7gm of French Coffee Powder.");
            this.french_coffee_powder = getFrench_coffee_powder() - 7;
            System.out.println("Taking 0.7 liter of Milk.");
            this.milk = getMilk() - 0.7;
            System.out.println("Taking 0.3 liter of Water.");
            this.water = getWater() - 0.3;
            System.out.println("\nYour French Coffee is Ready.");
            this.Coffee_Count++;
        }
        else
        {
            System.out.println("Available French Coffee Power(Gram) "+ getFrench_coffee_powder());
            System.out.println("Available Milk(Liter) "+ getMilk());
            System.out.println("Available Water(Liter) "+getWater() );
            System.out.println("\nSome ingredients are not enough or available, Please Fill before trying again.");
        }
    }

    private void BlackCoffee()
    {
        if(this.coffee_powder >= 10 && this.water >= 0.2)
        {
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
        }
        else
        {
            System.out.println("Available Coffee Power(Gram) "+ getCoffee_powder());
            System.out.println("Available Water(Liter) "+getWater() );
            System.out.println("\nSome ingredients are not enough or available, Please Fill before trying again.");
        }
    }

    private void MilkCoffee()
    {
        if(this.coffee_powder >= 10 && this.milk >= 0.4 && this.water >= 0.2){
            System.out.println("\nMaking Milk Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.milk = this.milk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Milk Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("Available Coffee Power(Gram) "+ getCoffee_powder());
            System.out.println("Available Milk(Liter) "+ getMilk());
            System.out.println("Available Water(Liter) "+getWater() );
            System.out.println("\nSome ingredients are not enough or available, Please Fill before trying again.");
        }
    }

    public void start()
    {
        System.out.println("\nCurrent Ingredients: ");
        this.GetIngredient();

        boolean powerON = true;
        while(powerON)
        {
            System.out.println("\n-------------------------------- " +
                    "\nChoice 1: Status of Ingredients " +
                    "\n-------------------------------- " +
                    "\nChoice 2: Fill Ingredients " +
                    "\n-------------------------------- " +
                    "\nChoice 3: Clean Machine " +
                    "\n-------------------------------- " +
                    "\nChoice 4: Make Coffee " +
                    "\n-------------------------------- " +
                    "\nChoice 5: Total Coffees made " +
                    "\n-------------------------------- " +
                    "\nChoice 6: Exit " +
                    "\n-------------------------------- \n");
            System.out.println("Enter your Choice: ");

            char choice = CoffeeMachine.scan.next().charAt(0);
            switch(choice){
                case '1':
                    System.out.println("------------- Status ------------");
                    this.GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.CleanMachine();
                    break;
                case '4':
                    this.makecoffee();
                    break;
                case '5':
                    System.out.println(this.Coffee_Count + " Coffee/s were made.");
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    powerON = false;
                    break;
            }
        }
    }
}

class MakeCoffee
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDo you want a coffee?, Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if(d == 'Y' || d == 'y')
        {
            CoffeeMachine cm = new CoffeeMachine();
            cm.start();
            System.out.println("Shutting Down...\n");
        }
        else
            System.out.println("Shutting Down...\n");
    }
}
