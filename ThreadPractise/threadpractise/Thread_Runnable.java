package threadpractise;

public class Thread_Runnable implements Runnable
{
    
    @Override
    public void run() 
    {
        show();  
    }
    
    public void show()
    {
        for(int i = 0; i<10;i++)
        {
            System.out.println(Thread.currentThread().getName() + "......" + i);
        }
    }
    
}
