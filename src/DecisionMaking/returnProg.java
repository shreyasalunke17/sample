package DecisionMaking;
public class returnProg
{
    public static void main(String[] args)
    {
        boolean t=true;
        System.out.println("Before the return.");
        if (t)
            return;
        // Compiler will bypass every statement after return
        System.out.println("This won't execute.");
    }
}

/*
Return: The return statement is used to explicitly return from a method. That is, it causes program control to transfer
back to the caller of the method.

Time Complexity: O(1)
Auxiliary Space: O(1)
*/




























