package IncrementDecrement;
class PostIncrement2
{
    public static void main(String[] args)
    {
        int variable = 17;
        System.out.println("Original value of the variable="+variable);

        int postIncrement = variable++;
        System.out.println("postIncrement++ = "+postIncrement++);
        System.out.println("postIncrement++ = "+postIncrement++);
        System.out.println("postIncrement++ = "+postIncrement++);
        System.out.println("Final value after postIncrement = "+postIncrement);
    }
}




















/* Post-Increment Operator (x++)
If the increment operator (++) is specified after the variable like a postfix (x++),then it is called post-increment operator */














