package Session2;

import java.util.Scanner;

public class DayName
{
    public static void main(String[] args)
    {
        int day;
        Scanner input = new Scanner(System.in);

        //day = 1;
        //day = 2;
        //day = 3;
        //day = 4;
        //day = 5;
        //day = 6;
        //day = 7;
        //day = 8;

        System.out.print("Enter day number: ");
        day = input.nextInt();

        switch(day)
        {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }
    }
}
