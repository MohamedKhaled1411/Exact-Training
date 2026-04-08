package Session3;

public class StringUtils
{
    public static void main(String[] args)
    {
        System.out.println(isEmpty("No"));
        System.out.println(capitalise("one"));
        System.out.println(repeat("five", 5));
        System.out.println(countChar("bubble", 'b'));

    }

    public static boolean isEmpty(String s)
    {
        return s.length() == 0;
    }

    public static String capitalise(String s)
    {
        return s.toUpperCase();
    }

    public static String repeat (String s, int n)
    {
        String str = "";
        while (n > 0)
        {
            str += s;
            n--;
        }
        return str;
    }

    public static int countChar(String s, char c)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }
}
