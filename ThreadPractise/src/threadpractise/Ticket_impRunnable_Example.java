package threadpractise;

public class Ticket_impRunnable_Example implements Runnable
{
    public static int NUM = 100;
        
    public void run()
    {
        sale();
    }
    
    public void sale()
    {
        while(true)
        {
            if(NUM > 0)
            {
                System.out.println(Thread.currentThread().getName() + "...sale..." + NUM--);
            }
        }
    }
    
} 
