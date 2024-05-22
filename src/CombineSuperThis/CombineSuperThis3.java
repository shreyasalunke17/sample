package CombineSuperThis;
class parentclass
{
    String name;
    parentclass()
    {
        this("");
        System.out.println("default constructor of parent class");
    }
    parentclass(String name)
    {
        this.name=name;
        System.out.println("line 13,parameterized constructor of parent class");
    }
}
class childclass extends parentclass
{
    childclass()
    {
        System.out.println("default constructor of child class");
    }
    childclass(String name)
    {
        super(name);
        //this();
        System.out.println("line 26,parameterized constructor of child class");
    }
    public static void main(String[] args)
        {
            childclass obj=new childclass("test");  //13 26
        }
}

