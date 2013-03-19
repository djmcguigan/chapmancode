public class CoinAmounts
{
    private int myChange;
    
    public CoinAmounts (int change)
    {
        myChange = change;
    }
    
    public void findChange()
    {
        System.out.println(myChange + " cents =>");
        int quarters = myChange / 25;
        System.out.println("Quarters = \t" + quarters);
        int dimes = (myChange % 25) / 10;
        System.out.println("Dimes = \t" + dimes);
        int nickels = ((myChange % 25) % 10) / 5;
        System.out.println("Nickels = \t" + nickels);
        int pennies = (((myChange % 25) % 10) % 5) / 1;
        System.out.println("Pennies = \t" + pennies);
        System.out.println();
    }
}