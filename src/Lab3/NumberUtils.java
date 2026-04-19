package Lab3;

public class NumberUtils
{
    public static void main (String[] args)
    {
        System.out.println("Prime: " + isPrime(7));
        System.out.println("Palindrome: " + isPalindrome(1234321));
        System.out.println("Reverse: " + reverseNumber(1234));
        System.out.println("Sum Digits: " + sumDigits(246));
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static boolean isPalindrome(int n)
    {
        String num = Integer.toString(n);

        for (int i = 0; i <= num.length()/2; i++)
        {
            if (num.charAt(i) != num.charAt(num.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int n)
    {
        int reversed = 0;
        int digit;

        if (n < 10) return n;
        else
        {
            while(n != 0)
            {
                digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            return reversed;
        }
    }

    public static int sumDigits(int n)
    {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }
}
