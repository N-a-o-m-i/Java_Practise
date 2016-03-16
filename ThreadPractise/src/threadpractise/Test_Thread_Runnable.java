package threadpractise;

public class Test_Thread_Runnable 
{
    public static void main(String args[])
    {
        
        Thread_Runnable threadRunnable = new Thread_Runnable();
        
        Thread thread1 = new Thread(threadRunnable);
        Thread thread2 = new Thread(threadRunnable);
        
        thread1.start();
        thread2.start();
        
    }
}
