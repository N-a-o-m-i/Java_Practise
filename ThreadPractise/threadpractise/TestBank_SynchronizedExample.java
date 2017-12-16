package threadpractise;

public class TestBank_SynchronizedExample 
{
    public static void main(String args[])
    {
        Customer_SynchronizedExample c = new Customer_SynchronizedExample();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        
        t1.start();
        t2.start();
    }
    
}
