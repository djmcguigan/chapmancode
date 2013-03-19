public class PiggyBank
{
    private int myPennies;
    private int myNickels;
    private int myDimes;
    private int myQuarters;
    
    public PiggyBank()
    {
        myPennies = 0;
        myNickels = 0;
        myDimes = 0;
        myQuarters = 0;
    }
    
    public PiggyBank(int pennies, int nickels, int dimes, int quarters)
    {
        myPennies = pennies;
        myNickels = nickels;
        myDimes = dimes; 
        myQuarters = quarters;
    }
    
    public int getNumPennies()
    {
        return myPennies;
    }
    
    public int getNumNickels()
    {
        return myNickels;
    }
    
    public int getNumDimes()
    {
        return myDimes;
    }
    
    public int getNumQuarters()
    {
        return myQuarters;
    }
    
    public void addChange(int pennies, int nickels, int dimes, int quarters)
    {
        myPennies += pennies;
        myNickels += nickels;
        myDimes += dimes;
        myQuarters += quarters;
    }
    
    public double getBalance()
    {
        return (.01 * myPennies) + (.05 * myNickels) + (.10 * myDimes) + (.25 * myQuarters);
    }
}