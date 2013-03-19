//-----------------------Beginning of Car Class---------------------//
public class Car
{
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;
    
    public Car()
    {
        myStartMiles = 0;
        myEndMiles = 0;
        myGallonsUsed = 0;
    }
    
    public Car(int odometerReading)
    {
        myStartMiles = odometerReading;
        myEndMiles = 0;
        myGallonsUsed = 0;
    }
    
    public void fillUp(int odometerReading, double gallons)
    {
        myEndMiles = odometerReading;
        myGallonsUsed += gallons;
        
    }
    
    public double calculateMPG()
    {
        return (myEndMiles - myStartMiles) / myGallonsUsed;
    }
    public void resetMPG()
    {
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }
    
    public int initialOdometer()
    {
        return myStartMiles;
    }
}
//----------------------------End of Car Class----------------------//