# OPP Relationships

***
### Association (USES-A)
>It's the relationship between two or more classes that doesn't depend on each other but can use each other's methods,
>but with no ownership of one class to the other. 
- Use Case: Creating an object from both classes and associate through them.
- Relationship Direction: Unidirectional or Bidirectional (both classes can use each other).
- Cardinality: one-to-one, one-to-many, many-to-one or many-to-many.
- Example: Man uses a tool.
<details>
<summary>Code Example</summary>

```java

// Man Class
class Man
{
    public void useTool (String tool)
    {
        System.out.println("Use " + tool);
    }
}

// Tool class
class Tool
{
    private String name;

    public Tool (String name)
    {
        this.name = name;
    }

    public String getTool()
    {
        return this.name;
    }
}

// Association between classes using objects
class Association
{
    public static void main(String[] args)
    {
        Man man = new Man();
        Tool tool = new Tool("axe");

        man.useTool(tool.getTool());

    }
}
```
</details>

***
### Inheritance (IS-A)
>It's the relationship of a class that inherit (extends) another class (superclass) while the subclass is dependent on
the superclass, the superclass isn't dependent on the subclass.
- Use Case: Creating a class that extends another class and can use its methods.
- Relationship Direction: Unidirectional only (subclass is a superclass, but not the opposite).
- Cardinality: one-to-one, one-to-many, many-to-one or many-to-many.
- Example: Cat is an animal.

***
### Aggregation (HAS-A)
>It's a type of association relationship. The classes are independent, 
>where each class can exist on its own, with shared ownership.
>One of the most common relationship used in Java.
- Use Case: Creating an object inside the class that has that object.
- Relationship Direction: Unidirectional (superclass has an object of subclass, but not the opposite).
- Cardinality: one-to-one, one-to-many, many-to-many or many-to-many.
- Example: Computer has a processor.

***
### Composition (PART-OF)
>It's a type of association relationship. The classes are dependent on each other, 
>where one class can't exist without the other, with exclusive ownership.
>Less common relationship used in Java.
- Use case: Creating an object of the subclass and access it through superclass object.
- Relationship Direction: Unidirectional (subclass is part of superclass, but not the opposite).
- Cardinality: one-to-one, one-to-many.
- Example: Room is part of a home.



***
***
<details><summary>Sources</summary>

- [Association, Composition and Aggregation in Java](https://www.geeksforgeeks.org/java/association-composition-aggregation-java/)
- [What is Is-A-Relationship in Java?](https://www.geeksforgeeks.org/java/what-is-is-a-relationship-in-java/)
- [What is Has-A-Relation in Java?](https://www.geeksforgeeks.org/java/what-is-has-a-relation-in-java/)
- [Composition: Understanding Has-A vs. Is-A in Java](https://medium.com/@noble_frost_lion_664/composition-understanding-has-a-vs-is-a-in-java-1a1d8e2eab50)
- [OOP in C++ Explained: IS-A vs HAS-A Relationship (Inheritance vs Composition Guide)](https://dev.to/master-rj/oop-in-c-explained-is-a-vs-has-a-relationship-inheritance-vs-composition-guide-g5o)
- [HAS-A vs IS-A in OOP C#](https://dev.to/tak089/has-a-vs-is-a-in-oop-c-3m30)
</details>

###### _Mohamed Khaled_
###### _April 2026_