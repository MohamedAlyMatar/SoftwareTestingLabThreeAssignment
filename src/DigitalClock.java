import java.lang.*;
import java.util.Calendar;
import java.util.Scanner;

public class DigitalClock {
    private int hours, minutes, seconds;
    public DigitalClock(){
        this.hours=0;
        this.minutes=0;
        this.seconds=0;
    }
    static Calendar cal = Calendar.getInstance();

    public int getHours(){return hours;}
    public int getMinutes(){return minutes;}
    public int getSeconds(){return seconds;}

    public void setHours(int hours){this.hours = hours;}
    public void setMinutes(int minutes){this.minutes = minutes;}
    public void setSeconds(int seconds){this.seconds = seconds;}

    public String SetClock(){
        hours = cal.get( Calendar.HOUR_OF_DAY );
        if ( hours > 12 ) hours -= 12;
        setHours(hours);

        minutes = cal.get( Calendar.MINUTE );
        setMinutes(minutes);

        seconds = cal.get( Calendar.SECOND );
        setSeconds(seconds);

        return ("Clock is Set");
    }

    public String getTime(){
        System.out.println(getHours() + " : "+ getMinutes() + " : "+ getSeconds());
        return ("Clock displayed");
    }

    public void start()
    {
        boolean powerON = true;
        while(powerON)
        {
            SetClock();
            System.out.println("\n-------------------------------- " +
                    "\nWhat do you want to see?" +
                    "\n-------------------------------- " +
                    "\nChoice 1: Get hours " +
                    "\n-------------------------------- " +
                    "\nChoice 2: Get minutes " +
                    "\n-------------------------------- " +
                    "\nChoice 3: Get seconds " +
                    "\n-------------------------------- " +
                    "\nChoice 4: Get full time " +
                    "\n-------------------------------- " +
                    "\nChoice 5: Exit " +
                    "\n-------------------------------- \n");

            System.out.println("Enter your Choice: ");
            char choice = CoffeeMachine.scan.next().charAt(0);
            switch(choice){
                case '1':
                    System.out.println(getHours());
                    break;
                case '2':
                    System.out.println(getMinutes());
                    break;
                case '3':
                    System.out.println(getSeconds());
                    break;
                case '4':
                    getTime();
                    break;
                case '5':
                    System.out.println("\nExiting...");
                    powerON = false;
                    break;
            }
        }
    }
}

class UseWatch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDo you want to start?, Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if(d == 'Y' || d == 'y')
        {
            DigitalClock clock = new DigitalClock();
            clock.start();
            System.out.println("Shutting down...\n");
        }
        else
            System.out.println("Shutting down...\n");
    }
}
