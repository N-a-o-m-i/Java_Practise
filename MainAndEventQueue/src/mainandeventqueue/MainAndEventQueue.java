package mainandeventqueue;

/**
 *
 * @author Naomi
 */

/**
   A class which demonstrates how a Swing application is multi-threaded
   with the main thread and the event dispatch thread
   @author Andrew Ensor
*/
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainAndEventQueue extends JPanel implements ActionListener
{
    private JLabel label;
    private int counter;

    public MainAndEventQueue()
    {  
        super();
        setPreferredSize(new Dimension(600, 400));
        label = new JLabel();
        add(label);
        counter = 0;
        // call actionPerformed method every 1000ms using Swing timer
        Timer timer = new Timer(500, this);
        timer.start();
    }
   
    public void actionPerformed(ActionEvent e)
    {  
       label.setText("Event thread counting: " + counter++);
    }
   
    public static void main(String[] args)
    {   
        JFrame frame = new JFrame("Main and Event Queue Thread Example");
        // kill all threads when frame closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MainAndEventQueue());
        frame.pack();
        // position the frame in the middle of the screen
        Toolkit tk = Toolkit.getDefaultToolkit();//cannot use new to instantiation, this can return the object of Toolkit
        Dimension screenDimension = tk.getScreenSize();
        Dimension frameDimension = frame.getSize();
        frame.setLocation((screenDimension.width-frameDimension.width)/2,
            (screenDimension.height-frameDimension.height)/2);
        frame.setVisible(true);
         // now display something while the main thread is still alive
        for (int i=0; i<100; i++)
        {  
            System.out.println("Main thread counting: " + i);
            try
            {  
                Thread.sleep(100); // delay for 100ms
            }
            catch (InterruptedException e)
            {}
        }
        System.out.println("Main thread about to die");
    }
}
