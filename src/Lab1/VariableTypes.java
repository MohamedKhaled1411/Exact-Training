package Lab1;

public class VariableTypes
{
    public static void main(String[] args)
    {
        byte a = 40;
        short b = 20000;
        int c = 2342342;
        float d = 103.021f;
        double e = 346.134242;
        long f = 294924223;
        boolean g = true;
        char h = 'b';

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e  + "\n" + f  + "\n" + g + "\n" + h);

        final int MAX_SCORE = 100;
        //MAX_SCORE = MAX_SCORE * 2;
        //Error: "cannot assign a value to final variable MAX_SCORE"
    }
}
