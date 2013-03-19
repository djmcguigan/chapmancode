
/**
 * Write a description of class LoanTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class LoanTable
{
    private double myPrinciple;
    private int myTime;
    private double myLowRate;
    private double myHighRate;

    public LoanTable()
    {
        myPrinciple = 0;
        myTime = 0;
        myLowRate = 0;
        myHighRate = 0;
    }
    
    public LoanTable(double principle, int time, double low, double high)
    {
        myPrinciple = principle;
        myTime = time;
        myLowRate = low;
        myHighRate = high;
    }
    
    public void input()
    {
        Scanner n00b = new Scanner(System.in);
        
        System.out.print("Enter loan amount -->  ");
        myPrinciple = n00b.nextDouble();
        System.out.println();
        System.out.print("Enter repayment time -->  ");
        myTime = n00b.nextInt();
        System.out.println();
        System.out.print("Enter low rate -->  ");
        myLowRate = n00b.nextDouble();
        System.out.println();
        System.out.print("Enter high rate -->  ");
        myHighRate = n00b.nextDouble();
        System.out.println(); 
    }
    
    private double monthlyRate()
    {
        double rate = 0;
        rate = (myPrinciple * (myLowRate / 12.0/100)) * Math.pow(1 + (myLowRate / 12.0/100), myTime * 12);
        rate = rate / (Math.pow(1 + (myLowRate / 12.0/100), myTime * 12) - 1);
        return rate;
    }
    
    public void output()
    {
        System.out.print("Principle = ");
        System.out.printf("$%,.2f", myPrinciple);
        System.out.println();
        System.out.println("Repayment Time = " + myTime);
        System.out.print( "Low Rate = ");
        System.out.printf("%,.2f", myLowRate);
        System.out.println();
        System.out.print("High Rate = ");
        System.out.printf( "%,.2f", myHighRate);
        System.out.println();
        while(myLowRate <= myHighRate)
        {
            System.out.printf("%10.2f", myLowRate);
            System.out.print("\t\t");
            System.out.printf("%10.2f",monthlyRate());
            myLowRate += .25;
            System.out.println();
        }
    }
}