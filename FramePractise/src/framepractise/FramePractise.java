package framepractise;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author Naomi
 */
public class FramePractise 
{

    public static void main(String[] args) 
    {
        Frame f = new Frame("Naomi's frame");
//        f.setSize(500, 400);
//        f.setLocation(1000, 200);
        f.setBounds(1000, 200, 500, 400);
        f.setLayout(new FlowLayout());//the default layout is BorderLayout, setLayout method can change the layout to whatever you want
        
        Button but = new Button("a button");
        f.add(but);//add the botton to the panel
        
        f.setVisible(true);
        System.out.println("Over");
    }
    
}
