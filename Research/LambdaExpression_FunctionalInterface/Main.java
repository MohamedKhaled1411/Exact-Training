package Research.LambdaExpression_FunctionalInterface;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");

        Consumer<String> printItem = item -> System.out.println("Fruit: "+ item);
        items.forEach(printItem);

        /* Instead of using
        Consumer<String> printItem = new Consumer<String>() {
            @Override
            public void accept(String item)
            {
                System.out.println("Fruit: " + item);
            }
        };
        */
    }
}
