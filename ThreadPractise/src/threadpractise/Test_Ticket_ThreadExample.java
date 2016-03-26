package threadpractise;

public class Test_Ticket_ThreadExample
{
    public static void main(String args[])
    {
         Test_Ticket_extendsThread_Example t1 = new Test_Ticket_extendsThread_Example("Window One");
         Test_Ticket_extendsThread_Example t2 = new Test_Ticket_extendsThread_Example("Window Two");
         Test_Ticket_extendsThread_Example t3 = new Test_Ticket_extendsThread_Example("Window Three");
         Test_Ticket_extendsThread_Example t4 = new Test_Ticket_extendsThread_Example("Window Four");
         
         t1.start();
         t2.start();
         t3.start();
         t4.start();
    }
 
}
