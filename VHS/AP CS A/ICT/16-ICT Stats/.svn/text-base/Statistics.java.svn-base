import java.util.*;
import java.io.*;

public class Statistics
{
    private final int MAX = 1000;
    private int[] myArr;
    
    public Statistics(String fileName)
    {
        myArr = new int[MAX];
       
        loadFile(fileName);          
    }
    
    private void loadFile(String fileName)
    {
        
        Scanner inFile;
        int count = 0; // will keep track of both the current index, and the 
                       // # of elements in the file (UP to 1000, so could be less)
        try
        {
            inFile = new Scanner (new File(fileName));

            while (inFile.hasNextInt())
            {
                int value = inFile.nextInt();
                myArr[count] = value;
                count++;
            }
         }
         catch(IOException err)
         {
            System.out.println(err.getMessage());    
         }
         
         copy (count);
         
    }

    private void copy(int length)
    {
       int[] temp = new int[length];
       for (int i = 0; i < length; i++)
          temp[i]= myArr[i];
          
       myArr = temp;  // has myArr point to temp's array instead
    }

    public double average(String fileName)
    {
        double avg = 0;
        int value = 0;
        
        for(int num = 0; num < myArr.length; num++)
        {
            avg += myArr[num];
        }
        avg /= myArr.length;
        return avg;
    }
    
    public double standardDeviation(String fileName)
    {
        double dev, stanDev = 0;
        double avg = average(fileName);
        for(int number = 0; number < myArr.length; number++)
        {
            dev = myArr[number] - avg;
            dev = Math.pow(dev, 2);
            stanDev += dev;
        }
        stanDev = stanDev / (myArr.length - 1);
        stanDev = Math.sqrt(stanDev);
        return stanDev;
    }
    
    public void mode(String fileName)
    {
        int mode = 0;
        int count = 0;
        int num = 0;
        int largest = 0;
        
        int[] modeArr = new int[101];
        for(count = 0; count < myArr.length; count++)
        {   
            int value = myArr[count];
            modeArr[value]++;
        }
        for(num = 0; num < modeArr.length; num++)
        {
            if(modeArr[num] >= largest)
            {
                largest = modeArr[num];
            }
        }
        for(num = 0; num < modeArr.length; num++)
            if(modeArr[num] == largest)
                System.out.println("The mode is: " + num);
    }
}