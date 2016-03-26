package threadpractise;

public class Test_Ticket_extendsThread_Example extends Thread
{
    public static int NUM = 100;
    public String name;
    
    public Test_Ticket_extendsThread_Example(String name)
    {
        super(name);
    }
    
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
