## Lambda Expression
>The lambda expression allows passing code as a parameter or assigning it to variables.
>It's often used to implement a functional interface instead of an anonymous class. 
```java
// one parameter
parameter -> expression

// More than one parameter
(parameter1, parameter2) -> expression

// For more expression
(parameter1, parameter2) -> {
    expression
    expression
}
```
***

## Functional Interface
>Any interface with only one method is called "Functional Interface",
while any interface with more than one method is called "Interface".\
>it's suitable to use with lambda expression, it helps in writing a clean and concise code.\
>Also a functional interface can extend another functional interface.

### Java built-in interface example
```java
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
```
