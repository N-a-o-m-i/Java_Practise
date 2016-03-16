package threadpractise;

public class Test_Thread_extendsThread 
{
    public static void main(String args[])
    {
        Thread t = new Thread();
        
        Thread_extendsThread tc1 = new Thread_extendsThread("Outer");
        Thread_extendsThread tc2 = new Thread_extendsThread("Inner");
        
        tc1.start();
        System.out.println("This is the GAP!!..." + Thread.currentThread().getName());
        tc2.start();
        System.out.println("Over!!.............." + Thread.currentThread().getName());
    }
}
