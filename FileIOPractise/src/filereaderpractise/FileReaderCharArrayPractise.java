package filereaderpractise;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Naomi
 */
public class FileReaderCharArrayPractise
{
    
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("FileReaderDemo.txt");
        
        char[] buf = new char[1024];
        
        int num = 0;
        
        while((num = fr.read(buf)) != -1)
        {
            System.out.println(num + ":" + new String(buf,0,num));
        }
        
//        int num1 = fr.read(buf);
//        System.out.println(num1 + ":" + new String(buf,0,num1));
//        
//        int num2 = fr.read(buf);
//        System.out.println(num2 + ":" + new String(buf,0,num2));
//        
//        int num3 = fr.read(buf);
//        System.out.println(num3 + ":" + new String(buf,0,num3));
//        
//        int num4 = fr.read(buf);
//        System.out.println(num4 + ":" + new String(buf));
    }

}
