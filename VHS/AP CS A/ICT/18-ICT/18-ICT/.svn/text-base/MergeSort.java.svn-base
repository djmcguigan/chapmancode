import java.util.*;
public class MergeSort
{
    public void mergeSort (ArrayList <Comparable> list, int first, int last)
    {
        if(last - first == 1){}
        else if(last - first == 2)
        {
            if(list.get(first).compareTo(list.get(last)) > 0)
            {
                Comparable temp = list.get(first);
                list.set(first, list.get(last));
                list.set(last, temp);
            }
        }
        else
        {
            int  mid;
            mid = (first + last) / 2;
            mergeSort (list, first, mid);
            mergeSort (list, mid+1, last);
            merge (list, first, mid, last);
        }
    }
    
    public void merge(ArrayList <Comparable> list, int first, int mid, int last)
    {
        ArrayList <Comparable> temp = new ArrayList <Comparable> (list);
        
        int indexA = 0, indexB = 0;
        
        for(int i = 0; i < list.size(); i++)
        {
            if(indexA > mid)
            {
                list.set(i, temp.get(indexB));
                indexB++;
            }
            else if(indexB > last)
            {
                list.set(i, temp.get(indexA));
                indexA++;
            }
            else if(list.get(indexA).compareTo(list.get(indexB)) < 0)
            {
                list.set(i, temp.get(indexA));
                indexA++;
            }
            else
            {
                list.set(i, temp.get(indexB));
                indexB++;
            }
        }
    }
}