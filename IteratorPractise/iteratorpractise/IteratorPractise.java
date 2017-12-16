package iteratorpractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractise
{
    public static void main(String[] args)
    {
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        
        coll1.add("a");
        coll1.add("b");
        coll1.add("c");
        coll1.add("d");
        coll1.add("e");
        
        System.out.println("The collection one is: " + coll1);
        
        //using iterator to get all the elements,
        //after while(), the iterator still exist
        Iterator it1 = coll1.iterator();
        System.out.println("Using while to iterator: ");
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        
        coll2.add("A");
        coll2.add("B");
        coll2.add("C");
        coll2.add("D");
        coll2.add("E");
        
        System.out.println("The collection two is: " + coll2);
        
        //using for loop to get all the elements,
        //after for loop, the iterator gone
        System.out.println("Using for loop to iterator: ");
        for(Iterator it2 = coll2.iterator(); it2.hasNext();)
        {
            System.out.println(it2.next());
        }
        
        
        
    }

}
