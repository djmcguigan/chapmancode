// avg should be 49.92
// stdev should be 29.45
// modes should be 10 and 48

public class StatisticsDriver
{
    public static void main(String[] args)
    {
        Statistics stats = new Statistics("numbers.txt");
        
        System.out.println("The average of the data is :");
        System.out.printf("%.2f", stats.average("numbers.txt"));
        
        System.out.println("\n\nThe standard deviation of the data is :");
        System.out.printf("%.2f", stats.standardDeviation("numbers.txt"));
        
        System.out.println("\n\n");
        stats.mode("numbers.txt");  
     
    }
}
