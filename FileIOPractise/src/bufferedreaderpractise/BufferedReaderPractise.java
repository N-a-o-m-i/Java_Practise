package bufferedreaderpractise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Naomi
 */
public class BufferedReaderPractise 
{
    
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("BufferedWriterDemo.txt");
        
        BufferedReader bufr = new BufferedReader(fr);
        
        String line = null;
        
        while((line = bufr.readLine()) != null)
        {
            System.out.println(line);
        }

    }

}
