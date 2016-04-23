package fileio_copytextpractise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naomi
 */
public class CopyTextUsingArray 
{
    private static final int BUFFER_SIZE = 1024;
    
    public static void main(String[] args) throws IOException
    {
        FileReader fr = null;
        FileWriter fw = null;
        
        try
        {
            fr = new FileReader("CopyMe.txt");
            fw = new FileWriter("CopiedMe2.txt");
            
            //create a temporary container,to hold the charactor
            char[] buf = new char[BUFFER_SIZE];
            //define a variable to record the read charactor, which is the length of the number in the container
            int len = 0;
            while((len = fr.read(buf)) != -1)
            {
                fw.write(buf, 0, len);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Fail to readnd write");
        }
        finally
        {
            if(fw != null)
            {
                try 
                {
                    fw.close();
                } 
                catch (IOException e)
                {
                    throw new IOException("Fail to close FileWriter!");
                }
            }
            if(fr != null)
            {
                try 
                {
                    fr.close();
                } 
                catch (IOException e)
                {
                    throw new IOException("Fail to close FileReader!");
                }
            } 
        }   
    }
}
