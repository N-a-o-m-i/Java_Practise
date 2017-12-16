package synchronizedpractice;

public class RunPingPongSyn extends Thread
{
    private String w;
    static Callme target;
    
    public RunPingPongSyn(String whatToSay)
    {
        w = whatToSay;
    }
    
    public void run()
    {
        target.call(w);
    }
    
    public static void main(String[] args)
    {
        target = new Callme();
        Thread ping = new RunPingPongSyn("ping");
        Thread pong = new  RunPingPongSyn("PONG");
        ping.start();
        pong.start();
    }
}

