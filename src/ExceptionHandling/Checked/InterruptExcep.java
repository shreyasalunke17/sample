package ExceptionHandling.Checked;
class InterruptException
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
                System.out.println("Thread was interrupted");
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
