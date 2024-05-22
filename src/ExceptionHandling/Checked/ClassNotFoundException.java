package ExceptionHandling.Checked;
class ClassNotFound
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        // Calling the class ABC which is not present in the
        // current class temp instance of calling class

        Class temp = Class.forName("ABC");
    }
}



















