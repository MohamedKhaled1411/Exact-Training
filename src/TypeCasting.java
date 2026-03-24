public class TypeCasting
{
    public static void main(String[] args)
    {
        double price = 29.99;
        int intPrice = (int) price;

        System.out.println((int) 7/2);
        System.out.println((double) 7/2);

        String num = "42";
        int intNum = Integer.parseInt(num);
        intNum = intNum * 2;

        System.out.println(intNum);
    }
}
