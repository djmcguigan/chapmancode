import kareltherobot.*;

public class Driver implements Directions
{
    public static void main(String[] args)
    {
        HBot dan = new HBot(1,1,North,7);
        dan.drawH();
        dan.turnOff();
    }
    
    static
    {
        World.reset();
        // World.readWorld();
        World.setDelay(20);
        World.setVisible(true);
    }
}