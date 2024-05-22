package Overloading;
class MethodOverloading4
{
    public void cube()
    {
        System.out.println("No Parameter");
    }
    public int cube(int number)
    {
        int cube=number*number*number;
        System.out.println("Cube Of Integer Parameter="+cube);
        return 1;
    }
    public int cube(float number)
    {
        float cube=number*number*number;
        System.out.println("Cube Of float parameter="+cube);
        return 1;
    }
    public static void main(String[] args)
        {
            MethodOverloading4 obj=new MethodOverloading4();
            obj.cube();
            obj.cube(5);
            obj.cube(2.0f);
        }
    }
