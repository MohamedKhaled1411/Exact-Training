package Session1;

public class StringExplorer
{
    public static void main (String[] args)
    {
        String name = "Mohamed Khaled";
        StringBuilder sb = new StringBuilder(name);

        System.out.println("Full name length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length()-1));
        System.out.println("Reversed: " + sb.reverse());

        boolean Space = name.matches(".*\\s.*");
        System.out.println("Full name space: " + Space);

    }
}
