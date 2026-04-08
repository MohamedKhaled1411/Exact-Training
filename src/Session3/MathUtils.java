package Session3;

public class MathUtils
{
    public static void main (String args[])
    {
        System.out.println(max(5, 10));
        System.out.println(min(5, 10));
        System.out.println(isEven(7));
        System.out.println(absolute(-8));
        System.out.println(power(10, -2));
    }


    public static int max (int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static int min (int a, int b)
    {
        if (a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static boolean isEven (int n)
    {
        if (n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int absolute (int n)
    {
        if (n < 0)
        {
            return -n;
        }
        else
        {
            return n;
        }
    }

    public static double power (double base, int exp)
    {
        double result = base;

        if (exp == 0)
        {
            result = 0;
        }
        else if (exp < 0)
        {
            for (int i = -1; i > exp; i--)
            {
                result *= base;
            }
            result = 1/result;
        }
        else
        {
            for (int i = 1; i < exp; i++)
            {
                result *= base;
            }
        }

        return result;
    }
}
