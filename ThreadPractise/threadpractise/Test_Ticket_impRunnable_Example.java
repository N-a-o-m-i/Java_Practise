package threadpractise;

public class Test_Ticket_impRunnable_Example
{
    public static void main(String args[])
    {
         Ticket_impRunnable_Example ticket = new Ticket_impRunnable_Example();
         
         Thread t1 = new Thread(ticket);
         Thread t2 = new Thread(ticket);
         Thread t3 = new Thread(ticket);
         Thread t4 = new Thread(ticket);
         
         t1.start();
         t2.start();
         t3.start();
         t4.start();
    }
    
}
