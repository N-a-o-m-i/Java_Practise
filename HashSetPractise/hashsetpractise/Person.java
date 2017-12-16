package hashsetpractise;

/**
 *
 * @author Naomi
 */
public class Person extends Object
{
    private String name;
    private int age;
    
    public Person()
    {
        super();
    }
    
    public Person(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() 
    {
        System.out.println(this + "......hashCode checked");
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if(this == obj)
            return true;
        if(!(obj instanceof Person))
            throw new ClassCastException("Wrong type");
            
        System.out.println(this + "...same hashCode...equals checked..." + obj);
        Person p = (Person) obj;
        
        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }
    
    public String toString()
    {
        
        return name + age;
    }
}
