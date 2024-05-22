package IncrementDecrement;
class PostDecrement4
{
public static void main(String[] args)
{
    int variable=35;
    System.out.println("Original value of the variable="+variable);

    int postDecrement = variable++;
    System.out.println("postDecrement-- = "+postDecrement--);
    System.out.println("postDecrement-- = "+postDecrement--);
    System.out.println("postDecrement-- = "+postDecrement--);
    System.out.println("Final value after postDecrement= "+postDecrement);
}
}




















/* Pre-Decrement Operator (--x)
If the decrement operator (--) is mentioned before the variable like a prefix (--x), then it is called a pre-decrement operator.
the value of the variable is first decremented by 1, and then other computations are performed. */

















