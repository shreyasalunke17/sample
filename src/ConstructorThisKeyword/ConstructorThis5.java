package ConstructorThisKeyword;
class Phone
{
    private String name;
    private int model;
    public Phone(String name,int model)
    {
        this.name=name;
        this.model=model;
    }
    public String getName()
    {
        return name;
    }
    public double getModel()
    {
        return model;
    }
}
class Mac extends Phone{
    private String capacity;
    private String display;
    public Mac(String name,int model,String capacity,String display)
    {
        super(name,model);
        this.capacity=capacity;
        this.display=display;
    }
    public String getCapacity()
    {
        return capacity;
    }
    public String getDisplay()
    {
        return display;
    }
}
public class ConstructorThis5
{
    public static void main(String[] args)
    {
        Mac obj = new Mac("Apple iphone pro max",15,"128GB","Super Retina XDR dispaly");
        System.out.println("Mac-Apple name: "+obj.getName());
        System.out.println("Mac Model: "+obj.getModel());
        System.out.println("Mac Capacity: "+obj.getCapacity());
        System.out.println("Mac Display: "+obj.getDisplay());
    }
}

