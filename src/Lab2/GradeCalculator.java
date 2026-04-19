package Lab2;

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        int score;
        char grade;
        Scanner input = new Scanner(System.in);

        //score = 30;
        //score = 50;
        //score = 75;
        //score = 85;
        //score = 95;

        System.out.print("Enter your score: ");
        score = input.nextInt();

        if (score >= 90)
        {
            grade = 'A';
            System.out.println("Grade: " + grade + "\nExcellent!");
        }
        else if (score >= 80)
        {
            grade = 'B';
            System.out.println("Grade: " + grade + "\nExcellent!");
        }
        else if (score >= 70)
        {
            grade = 'C';
            System.out.println("Grade: " + grade + "\nGood");
        }
        else if (score >= 50)
        {
            grade = 'D';
            System.out.println("Grade: " + grade + "\nGood");
        }
        else
        {
            grade = 'F';
            System.out.println("Grade: " + grade + "\nNeeds Improvement");
        }
    }
}
