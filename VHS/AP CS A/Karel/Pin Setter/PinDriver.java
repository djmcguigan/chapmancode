import kareltherobot.*;

public class PinDriver implements Directions
{
    public static void main(String[] args)
    {
        PinSetter bowler = new PinSetter(1,5,North,10);
        bowler.setPins();
        bowler.turnOff();
    }
    
    static
    {
        World.reset();
        // World.readWorld();
        World.setDelay(15);
        World.setVisible(true);
    }
}