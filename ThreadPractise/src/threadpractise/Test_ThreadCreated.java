package threadpractise;

public class Test_ThreadCreated 
{
    public static void main(String args[])
    {
        Thread t = new Thread();
        
        ThreadCreated tc1 = new ThreadCreated("Outer");
        ThreadCreated tc2 = new ThreadCreated("Inner");
        
        tc1.start();
        System.out.println("This is the GAP!!..." + Thread.currentThread().getName());
        tc2.start();
        System.out.println("Over!!.............." + Thread.currentThread().getName());
    }
}
