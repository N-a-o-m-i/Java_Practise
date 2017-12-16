package hashsetpractise;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Naomi
 */
public class HashSetPractise 
{

    public static void main(String[] args) 
    {
        HashSet hs = new HashSet();
        
        hs.add(new Person("Roy", 22));
        hs.add(new Person("Shaun", 23));
        hs.add(new Person("Sunny", 29));
        hs.add(new Person("Shaun", 23));
        
        Iterator it = hs.iterator();
        
        while(it.hasNext())
        {
            Person p = (Person) it.next();
            System.out.println(p.getName() + "..." + p.getAge());
        }
    }   
}
