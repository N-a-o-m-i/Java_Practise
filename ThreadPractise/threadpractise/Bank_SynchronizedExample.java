package threadpractise;

public class Bank_SynchronizedExample 
{
    private int sum;   
    private Object object = new Object();
    public synchronized void add(int num)
    {
//        synchronized(object)
//        {
            sum = sum + num;
            try
            {
               Thread.sleep(10); 
            }
            catch(InterruptedException e)
            {

            }
            System.out.println("sum = " + sum);
//        }
    }
    
}
