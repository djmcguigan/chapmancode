import java.util.*;

public class GroceryList
{
    private double myPrice1;
    private double myPrice2;
    private double myPrice3;
    private double myPrice4;
    private double myPrice5;
    private double myTotal;
    
    public GroceryList()
    {
        myPrice1 = 0;
        myPrice2 = 0;
        myPrice3 = 0;
        myPrice4 = 0;
        myPrice5 = 0;
        findCosts();
        myTotal = 0;
        output();
    }
    
    public GroceryList(double item1, double item2, double item3, double item4, double item5)
    {
        myPrice1 = item1;
        myPrice2 = item2;
        myPrice3 = item3;
        myPrice4 = item4;
        myPrice5 = item5;
        myTotal = 0;
        output();
    }
    
    public void findCosts()
    {
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter cost of item #1--> ");
        myPrice1 = key.nextDouble();
        System.out.println();
        System.out.print("Enter cost of item #2--> ");
        myPrice2 = key.nextDouble();
        System.out.println();
        System.out.print("Enter cost of item #3--> ");
        myPrice3 = key.nextDouble();
        System.out.println();
        System.out.print("Enter cost of item #4--> ");
        myPrice4 = key.nextDouble();
        System.out.println();
        System.out.print("Entere cost of item #5--> ");
        myPrice5 = key.nextDouble();
        System.out.println();
    }
    
    public void output()
    {
        System.out.printf("%-10s", "Items:");
        System.out.printf("%11s", "Prices:");
        System.out.printf("%12s", "Total:");
        System.out.println();
        System.out.printf("%-10s", "Item #1:");
        System.out.printf("%11.2f", myPrice1);
        System.out.printf("%12.2f", myTotal += myPrice1);
        System.out.println();
        System.out.printf("%-10s", "Item #2:");
        System.out.printf("%11.2f", myPrice2);
        System.out.printf("%12.2f", myTotal += myPrice2);
        System.out.println();
        System.out.printf("%-10s", "Item #3:");
        System.out.printf("%11.2f", myPrice3);
        System.out.printf("%12.2f", myTotal += myPrice3);
        System.out.println();
        System.out.printf("%-10s", "Item #4:");
        System.out.printf("%11.2f", myPrice4);
        System.out.printf("%12.2f", myTotal += myPrice4);
        System.out.println();
        System.out.printf("%-10s", "Item #5:");
        System.out.printf("%11.2f", myPrice5);
        System.out.printf("%12.2f", myTotal += myPrice5);
        System.out.println();
    }
}