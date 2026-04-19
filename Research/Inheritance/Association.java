package Research.Inheritance;

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