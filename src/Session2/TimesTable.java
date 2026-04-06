package Session2;

public class TimesTable
{
    public static void main (String[] args)
    {
        System.out.println("\t\tTable [1]\tTable [2]\tTable [3]\tTable [4]\tTable [5]");
        for (int i = 1; i <= 12; i++)
        {
            System.out.printf("[%d]", i);
            for (int j = 1; j <= 5; j++)
                {
                    System.out.printf("\t\t%dx%d=%d", j, i, i*j);
                }
            System.out.println("\t");
        }
    }
}
