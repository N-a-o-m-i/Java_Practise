package keyboardlistener;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Naomi
 */
public class KeyboardListener {
    
    private Frame f;
    private TextField tf;
    private Button but;

    public KeyboardListener() {
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
        
        //add a keyboard listener to a text field
        tf.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
//                System.out.println("Key running... Entered key is: " + KeyEvent.getKeyText(e.getKeyCode()) + "; Key Code is: " + e.getKeyCode());
                
                //only numbers entered
                int code = e.getKeyCode();
                if(!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9)){
                    System.out.println("Only numbers entered!");
                    e.consume();//don't know why cannot work!!!!!!!
                }
                
//                if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER){
//                    System.out.println("Enter and control are running...");
//                }
            }
        });
    }
    
    public static void main(String[] args) {
        new KeyboardListener();
    }
    
}
