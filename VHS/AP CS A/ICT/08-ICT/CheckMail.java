import java.util.*;

public class CheckMail
{
    private double myDim1;
    private double myDim2;
    private double myDim3;
    private double myWeight;
    
    public CheckMail()
    {
        myDim1 = 0;
        myDim2 = 0;
        myDim3 = 0;
        myWeight = 0;
    }
    
    public CheckMail(double dim1, double dim2, double dim3, double weight)
    {
        myDim1 = dim1;
        myDim2 = dim2;
        myDim3 = dim3;
        myWeight = weight;
    }
    
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a dimension -->    ");
        myDim1 = keyboard.nextDouble();
        System.out.println("Enter a dimension -->    ");
        myDim2 = keyboard.nextDouble();
        System.out.println("Enter a dimension -->    ");
        myDim3 = keyboard.nextDouble();
        System.out.println("Enter a weight -->    ");
        myWeight = keyboard.nextDouble();
        
        calcGirth();
    }
    
    public void findLongest()
    {
        if(myDim1 < myDim2)
        {
            double temp = myDim1;
            myDim1 = myDim2;
            myDim2 = temp;
        }
        else if(myDim1 < myDim3)
        {
            double temp = myDim1;
            myDim1 = myDim3;
            myDim3 = temp;
        }
    }
    
    public double calcGirth()
    {
        double girth = 2 * (myDim2 + myDim3);
        return girth;
    }
    
    public void output()
    {
        if((myDim1 + calcGirth() > 100) && (myWeight > 70))
        {
            System.out.println("Package is too large and too heavy.");
        }
        else if(myDim1 + calcGirth() > 100)
        {
            System.out.println("Package is too large.");
        }
        else if(myWeight > 70)
        {
            System.out.println("Package is too heavy.");
        }
        else
        {
            System.out.println("Package is acceptable.");
        }
    }
}