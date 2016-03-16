package threadpractise;

public class ThreadCreated extends Thread
{
    private String name;
    
    public ThreadCreated(String name)
    {
        super(name);
//        this.name = name;
    }
    
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(name + " of i is: " + i + "...ThreadName = " + Thread.currentThread().getName());
        }
    }
}
