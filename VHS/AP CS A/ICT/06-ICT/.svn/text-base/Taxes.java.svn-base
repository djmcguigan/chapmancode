
/**
 * @author McGuigy 
 * @version 10/31/07
 */
public class Taxes
{
    final double FEDTAX = 0.154;    //constant
    final double FICA = 0.0775;     //constant
    final double STATETAX = 0.04;   //constant
    
    private double myHoursWorked;   //private variable
    private double myHourlyRate;    //private variable
    
    //constructors
    public Taxes()
    {
        myHoursWorked = 0;
        myHourlyRate = 0;
    }
    
    public Taxes(double hours, double rate)
    {
        myHoursWorked = hours;
        myHourlyRate = rate;
        calcGrossPay();
    }
    
    //calculation methods
    public double calcGrossPay()
    {
        double gross = myHoursWorked * myHourlyRate;
        return gross;
    }
    
    public double calcFedTax()
    {
        double fedtax = FEDTAX * getGrossPay();
        return fedtax;        
    }
    
    public double calcFicaTax()
    {
        double fica = FICA * getGrossPay();
        return fica;
    }
    
    public double calcStateTax()
    {
        double state = STATETAX * getGrossPay();
        return state;
    }
    
    public double calcNetPay()
    {
        double net = getGrossPay() - (getFedTax() + getFicaTax() + getStateTax());
        return net;
    }
    
    //get methods
    public double getGrossPay()
    {
        return calcGrossPay();
    }
    
    public double getFedTax()
    {
        return calcFedTax();
    }
    
    public double getFicaTax()
    {
        return calcFicaTax();
    }
    
    public double getStateTax()
    {
        return calcStateTax();
    }
    
    public double getHoursWorked()
    {
        return myHoursWorked;
    }
    
    public double getHourlyRate()
    {
        return myHourlyRate;
    }
    
    public double getFEDTAX()
    {
        return FEDTAX;
    }
    
    public double getFICA()
    {
        return FICA;
    }
    
    public double getSTATETAX()
    {
        return STATETAX;
    }
}
