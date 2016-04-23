package fileio_copytextpractise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naomi
 */
public class CopyTextTest 
{
    
    public static void main(String[] args) throws IOException
    {
        //1. read an existed text file, 
        FileReader fr = new FileReader("CopyMe.txt");
        //2. create a new file to save the read data
        FileWriter fw = new FileWriter("CopiedMe.txt");
        //3. read and write frequently
        int ch = 0;
        while((ch = fr.read()) != -1)
        {
            fw.write(ch);
        }
        //4. close the stream
        fr.close();
        fw.close();
        
    }
    
    
    
    
}
