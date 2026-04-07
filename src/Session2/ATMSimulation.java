package Session2;

import java.util.Scanner;

public class ATMSimulation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double balance = 1000;
        double deposit;
        double withdraw;
        int menu;

        while(true)
        {
            System.out.print("\n[1] Check Balance\t\t[2] Deposit\n[3] Withdraw\t\t\t[4] Exit\n");
            System.out.print("Enter your [choice]: ");
            menu = input.nextInt();

            if (menu == 1)
            {
                System.out.println("\nAvailable Balance: " + balance);
            }
            else if (menu == 2)
            {
                System.out.println("Deposit Amount: ");
                deposit = input.nextDouble();
                if (deposit <= 0)
                {
                    System.out.println("\nDeposit amount must be greater than 0.");
                }
                else
                {
                    balance = balance + deposit;
                    System.out.println("\nAmount Deposited Successfully: " + deposit);
                    System.out.println("Total Balance: " + balance);
                }
            }
            else if (menu == 3)
            {
                System.out.println("Withdraw Amount: ");
                withdraw = input.nextDouble();
                if (withdraw > balance)
                {
                    System.out.println("\nInsufficient funds!");
                }
                else if (withdraw <= 0)
                {
                    System.out.println("\nWithdraw Amount must be greater than 0.");
                }
                else
                {
                    balance = balance - withdraw;
                    System.out.println("\nAmount Withdrawn Successfully: " + withdraw);
                    System.out.println("Total Balance: " + balance);
                }
            }
            else if (menu == 4)
            {
                System.out.println("\nThank you!\nExiting...");
                break;
            }
            else
            {
                System.out.println("\nInvalid Menu Selection");
            }
        }
    }
}
