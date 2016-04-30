package framepractise;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Naomi
 */
public class FramePractise {

    public static void main(String[] args) {
        Frame f = new Frame("Naomi's frame");
//        f.setSize(500, 400);
//        f.setLocation(1000, 200);
        f.setBounds(1000, 200, 500, 400);
        f.setLayout(new FlowLayout());//the default layout is BorderLayout, setLayout method can change the layout to whatever you want
        
        Button but = new Button("a button");
        f.add(but);//add the botton to the panel
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                System.out.println("Closing......" + e);
                System.exit(0);//If press down the close button, the windows closed.
            }
        });
        
        //place an listener on button
        but.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button running......");
                System.exit(0);
            }
        });
        
        f.setVisible(true);
        System.out.println("Over");
    }
    
}
