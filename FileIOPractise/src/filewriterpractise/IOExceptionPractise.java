package filewriterpractise;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Naomi
 * @throws IOException
 */
public class IOExceptionPractise
{
    
    public static void main(String[] args)
    {
        FileWriter fw = null;
        try 
        {
            fw = new FileWriter("FileWriterDemo.txt");

            fw.write("If life gives you lemons\n");

            String str = System.getProperty("line.separator") + "make lemonade";

            fw.write(str);

            fw.flush();
        } 
        catch (IOException e)
        {
            System.out.println(e.toString());
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
                    throw new RuntimeException("Fail to close");
                }
            }
        }
    }
    
}
