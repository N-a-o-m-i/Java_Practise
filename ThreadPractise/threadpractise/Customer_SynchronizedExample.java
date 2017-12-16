package threadpractise;

public class Customer_SynchronizedExample implements Runnable
{
    private Bank_SynchronizedExample bank = new Bank_SynchronizedExample();
    
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            bank.add(100);
        }
    }
    
}
