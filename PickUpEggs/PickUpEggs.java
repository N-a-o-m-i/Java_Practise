
public class PickUpEggs 
{
	public static void main(String[] args) 
	{  
	        
       	int i = 9;
       	int j = 0;
        while(i>=9)
        {
            if(i%1 == 0 && i%2 == 1 && i%3 == 0 && i%4 == 1 && 
               i%5 == 4 && i%6 == 3 && i%7 == 0 && i%8 == 1 && i%9 ==0)
            {
                System.out.println(i);
                j++;
                if(j>9)
                {
                	break;
                }
            } 
            i++;
        }
	}
}