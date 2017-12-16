package threadpractise;

public class Thread_extendsThread extends Thread
{
    private String name;
    
    public Thread_extendsThread(String name)
    {
        super(name);
    }
    
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(name + " of i is: " + i + "...ThreadName = " + Thread.currentThread().getName());
        }
    }
}
