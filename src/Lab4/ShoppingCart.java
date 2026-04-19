package Lab4;

import java.util.ArrayList;

public class ShoppingCart
{
    public static void main  (String[] args)
    {
        ArrayList<String> cart = new ArrayList<String>();

        //addItem
        cart.add("Java");
        cart.add("Python");

        //listItems
        System.out.println(cart);

        //itemCount
        System.out.println(cart.size());

        //removeItem
        cart.remove("Python");
        System.out.println(cart);

        //hasItem
        System.out.println(cart.contains("Python"));

        //clearCart
        cart.clear();
        System.out.println(cart);
    }
}
