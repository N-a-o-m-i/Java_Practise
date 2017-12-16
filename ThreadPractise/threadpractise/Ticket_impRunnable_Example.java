package threadpractise;

public class Ticket_impRunnable_Example implements Runnable
{
    public static int NUM = 10000;
    Object object = new Object();    
    
    public void run()
    {
        sale();
    }
    
    public void sale()
    {
        while(true)
        {
            synchronized(object)
            {
                if(NUM > 0)
                {
//                    try
//                    {
//                        Thread.sleep(10);
//                    }
//                    catch(InterruptedException e)
//                    {
//
//                    }
                    System.out.println(Thread.currentThread().getName() + "...sale..." + NUM--);

                }
            }
        }
    }
    
} 
