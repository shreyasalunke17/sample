package ExceptionHandling.Unchecked;
public class illegalThreadStateException
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running.");
        });

        // Starting the thread twice will cause IllegalThreadStateException
        thread.start();
        thread.start();
    }
}

/*
IllegalThreadStateException:This exception is thrown when a thread is in an inappropriate state for the requested operation.
For example, if you try to start a thread that has already been started or if you try to call join() on a thread that hasn't
been started yet, an IllegalThreadStateException will be thrown.
*/