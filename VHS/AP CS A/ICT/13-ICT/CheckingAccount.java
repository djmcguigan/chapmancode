public class CheckingAccount
{
    private double myBalance;
    private int myAccountNumber;

    public CheckingAccount()
    {
        myBalance = 0.0;
        myAccountNumber = 0;
    }

    public CheckingAccount(double initialBalance, int acctNum)
    {
        if (initialBalance >= 0)
        {
            myBalance = initialBalance;
            myAccountNumber = acctNum;
        }
        else
        {
            throw new IllegalArgumentException("Error: balance cannot be negative");
        }
    }

    public double getBalance()
    {
        return myBalance;
    }

    public void deposit(double amount)
    {
        if (amount < 0)
            throw new IllegalArgumentException("Error: amount cannot be negative");
        else
            myBalance += amount;
    }

    public void withdraw( double amount )
    {
        if (amount >= 0 && amount < myBalance)
            myBalance -= amount;
        else
            throw new IllegalArgumentException("Error: Overdrawn");
    }
}