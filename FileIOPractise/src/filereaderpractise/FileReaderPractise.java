package filereaderpractise;

import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author Naomi
 * @throws IOException
 */
public class FileReaderPractise 
{
    public static void main(String[] args) throws IOException
    {
        
        FileReader fr = new FileReader("FileReaderDemo.txt");
        
        int ch = 0;
        while((ch = fr.read()) != -1)
        {
            System.out.print((char)ch);
        }
        
//        int ch1 = fr.read();
//        System.out.println((char)ch1);
//        int ch2 = fr.read();
//        System.out.println((char)ch2);
        
        fr.close();
        
    }
    
    
    
    
}
