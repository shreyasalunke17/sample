package ExceptionHandling.Checked;
public class Interrupt
 {
    public static void main(String[] args)
    {
        Thread thread = new Thread(() -> {
            try
            {
                System.out.println("Thread is sleeping");
                Thread.sleep(5000); // Thread is sleeping for 5 seconds
                System.out.println("Thread woke up");
            }
            catch (InterruptedException e)
            {
             e.printStackTrace();
            }
        });
        thread.start();
        // Start the thread
        // Interrupt the thread after 2 seconds
        try
        {
            Thread.sleep(2000);
            thread.interrupt(); // Interrupt the sleeping thread
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

/*
InterruptedException in Java is thrown when a thread is waiting, sleeping, or otherwise occupied, and another thread
interrupts it using the interrupt() method. This typically occurs in multi-threaded environments where one thread wants
to interrupt the execution of another thread.
In this example, we create a new thread that performs a long-running task (sleeps for 5 seconds).
The main thread interrupts this other thread after waiting for 2 seconds. When the interruption occurs,
the sleeping thread throws an InterruptedException, which is caught and handled within the thread's run() method.
*/


















