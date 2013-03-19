public class CoinDriver
{
    public static void main (String[] args)
    {
        CoinAmounts coin = new CoinAmounts(94);
        coin.findChange();
        
        coin = new CoinAmounts(59);
        coin.findChange();
        
        coin = new CoinAmounts(19);
        coin.findChange();
    }
}