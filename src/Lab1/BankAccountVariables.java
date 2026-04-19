package Lab1;

public class BankAccountVariables
{
    public static void main (String[] args)
    {
        String accountHolder = "Mohamed Khaled";
        long accountNumber = 294203224;
        double balance = 1634.57;
        boolean isActive = true;

        String accountStatus;
        if (isActive)
            accountStatus = "Active";
        else
            accountStatus = "Inactive";

        System.out.printf("%nAccount Holder: %s%nAccount Number: %d%nAccount Balance: %.2f%nAccount Status: %s%n", accountHolder, accountNumber, balance, accountStatus);
    }
}
