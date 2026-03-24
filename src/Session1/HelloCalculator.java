package Session1;

public class HelloCalculator
{
    public static void main (String[] args)
    {
        int a = 15;
        int b = 4;

        boolean Divisible = (a%b == 0);

        System.out.println("Sum = " + (a+b));
        System.out.println("Difference = " + (a-b));
        System.out.println("Product = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Modulo = " + (a%b));
        System.out.println("Rest = " + Divisible);
    }
}
