package filewriterpractise;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naomi
 * @throws IOException
 * line feeds in two ways
 * create a new file
 * write words in the new file
 * Windows uses "\r\n" to a new line
 * Linux/Unix use "\r"
 * Mac uses "\n"
 */
public class FileWriterPractise
{
    
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("FileWriterDemo.txt");
        
        fw.write("If life gives you lemons\n");
        
        String str = System.getProperty("line.separator") + "make lemonade";
        
        fw.write(str);
        
        fw.flush();
        
//        fw.close();
        
        
    }
    
}
