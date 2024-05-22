package ExceptionHandling.Checked;
class Test
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        //Try block to check for exceptions
        try
        {
            Class temp = Class.forName("ABC"); //calling the ABC class
        }
        //Catch block to handle the exceptions
        catch (ClassNotFoundException e)
        {
            //block executes when mention exception occur
            System.out.println("Class does not exist check the name of the class");
        }
    }
}


/*
Handle ClassNotFoundException using the try-Catch block
*/
























