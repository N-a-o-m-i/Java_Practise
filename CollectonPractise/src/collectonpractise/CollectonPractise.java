package collectonpractise;

import java.util.ArrayList;
import java.util.Collection;

public class CollectonPractise {

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        
        show(coll);
        show(c1,c2);
    }
    
    public static void show(Collection c1, Collection c2)
    {
        //add five elements to collection c1
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        c1.add("e");
        System.out.println("c1: " + c1);
        
        //add five elements to collection c2
        c2.add("A");
        c2.add("B");
        c2.add("C");
        c2.add("d");
        c2.add("e");
        System.out.println("c2: " + c2);
        
        //Demo .addAll() method
        //add all c2 elements to c1
        boolean isAdded = c1.addAll(c2);
        System.out.println("Adding all c2 elements to c1 is successed?? " + isAdded);
        System.out.println("After adding all c2 elements to c1, c1 is: " + c1 + " c2 is: " + c2);
        
        //Demo .removeAll() method
        //remove all c2 elements from c1
        boolean isRemoved = c1.removeAll(c2);
        System.out.println("Removing all c2 elements from c1 is successed?? " + isRemoved);
        System.out.println("After removing all c2 element from c1, c1 is: " + c1 + " c2 is: " + c2);
        
        //Demo .contains() method
        boolean isContains = c1.contains("a");
        System.out.println("Does c1 have \"a\" element? " + c1.contains("a"));
        
        //Demo .containsAll() method
        boolean isContainsAll = c1.containsAll(c2);
        System.out.println("Doea c1 contain all the element in c2? " + c1.containsAll(c2));
        
        //Demo .retainAll() method
        boolean isRetainAll = c1.retainAll(c2);
        System.out.println("Does c1 have the same element as c2? " + c1.retainAll(c2));
    }
    
    public static void show(Collection coll)
    {
        //Demo .add() method
        coll.add("One");
        coll.add("Two");
        coll.add("Three");
        coll.add("Four");
        coll.add("Five");
        System.out.println("After adding five elements: " + coll);
        
        //Demo .remove() method
        coll.remove("Two");
        coll.remove("Three");
        System.out.println("After deleting two elements: " + coll);
        
        //Demo .clear() method
        coll.clear();
        System.out.println("After clearing all element: " + coll);
    }
    
}
