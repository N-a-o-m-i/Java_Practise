package bufferedwriterpractise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naomi
 */
public class BufferedWriterPractise 
{
    
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("BufferedWriterDemo.txt");
        
        BufferedWriter bufw = new BufferedWriter(fw);
        
        for(int i = 1; i < 10; i++)
        {
            bufw.write("abcde" + i);
            bufw.newLine();
            bufw.flush();
        }
    }
}
