import java.util.*;

public class Permutations
{
    
    
    public Permutations(){}
    
   
    
    public ArrayList <Integer> nextPermutation()
    {
        ArrayList <Integer> mainList = new ArrayList <Integer>();
        ArrayList <Integer> temp = new ArrayList <Integer> ();
        
        for(int j = 1; j <= 10; j++)
        {
            temp.add(new Integer(j));
        }
        
        for(int i = 0; i < 10; i++)
        {
            int rand = (int)(Math.random() * temp.size());
            mainList.add(temp.remove(rand));
        }
        return mainList;
    }
}