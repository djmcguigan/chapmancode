
/**
 * Write a description of class IRS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class IRS
{
    private int myFilingStatus;
    private double myIncome;

    
    public IRS()
    {
        myFilingStatus = 0;
        myIncome = 1;
        findStatus();
    }
    
    public IRS(int filingStatus, double income)
    {
        myFilingStatus = filingStatus;
        myIncome = income;
    }
    
    public void findStatus()
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter marital status(1=Single, 2=Married): ");
        myFilingStatus = key.nextInt();
        System.out.println();
        System.out.print("Enter yearly taxable income   $");
        myIncome = key.nextDouble();
        System.out.println();
    }
        
    public double single()
    {
        double tax = 0;
        
        if(myIncome <= 27050)
        {
            tax = myIncome * 0.15;
        }
        else if((myIncome > 27050) && (myIncome <= 65550))
        {
            tax = ((myIncome - 27050) * .275) + 4057.5;
        }
        else if((myIncome > 65550) && (myIncome <=136750))
        {
            tax = ((myIncome - 65550) * .305) + 14645;
        }
        else if((myIncome > 136750) && (myIncome <= 297350))
        {
            tax = ((myIncome - 136750) * .355) + 36361;
        }
        else
        {
            tax = ((myIncome - 297350) * .391) + 88306;
        }
        return tax;
    }
    
    public double married()
    {
        double tax = 0;
        
        if(myIncome <= 45200)
        {
            tax = myIncome * 0.15;
        }
        else if((myIncome > 45200) && (myIncome <= 109250))
        {
            tax = ((myIncome - 45200) * .275) + 6780;
        }
        else if((myIncome > 109250) && (myIncome <= 166500))
        {
            tax = ((myIncome - 109250) * .305) + 24393.75;
        }
        else if((myIncome > 166500) && (myIncome <= 297350))
        {
            tax = ((myIncome - 166500) * .355) + 41855;
        }
        else
        {
            tax = ((myIncome - 297350) * .391) + 88306;
        }
        
        return tax;
    }
    
    public void output()
    {
        if(myFilingStatus == 1)
        {
            System.out.print("Your Federal Tax = $");
            System.out.printf("%,.2f", single());
            System.out.println();
        }
        else if(myFilingStatus == 2)
        {
            System.out.print("Your Federal Tax = $");
            System.out.printf("%,.2f", married());
            System.out.println();
        }
        else
        {
            System.out.print("Your Federal Tax = $");
            System.out.printf("%,.2f", myIncome);
            System.out.println();
        }
    }
}
