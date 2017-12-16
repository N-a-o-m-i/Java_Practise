package mouseandkeylistenerpractise;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Naomi
 */
public class MouseAndKeyListenerPractise {

    private Frame f;
    private TextField tf;
    private Button but;

    public MouseAndKeyListenerPractise() {
        init();
    }
    
    //initialise frame and textfield
    private void init() {
        
        f = new Frame("Mouse and keyboard listener");
        f.setBounds(1000, 200, 500, 400);
        f.setLayout(new FlowLayout());
        
        tf = new TextField(40);
        but = new Button("A button");
        
        f.add(tf);
        f.add(but);
        
        myEvent();
        
        f.setVisible(true);
    }
    
    private void myEvent() {
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }            
        });
        
        //place a mouse listener on a button
        but.addMouseListener(new MouseAdapter(){
            
            private int count = 1;
            
            //if the mouse enter the button area, the output shows "Mouse enter..."
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse enter...");
//                tf.setText("Mouse enter..." + (count++));
            }

            //if the mouse exit the button, the output shows "Mouse exit"
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exit");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                //if mouse double click, the textfield shows the count of double click
                if(e.getClickCount() == 2){
                    tf.setText("Mouse double click..." + (count++));
                }
//                System.out.println("Mouse click..." + (count++));
            } 
        });
    }
    
    public static void main(String[] args) {
        new MouseAndKeyListenerPractise();
    }
}
