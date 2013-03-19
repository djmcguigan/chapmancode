import kareltherobot.*;

public class GardnerDriver implements Directions
{
    public static void main(String[] args)
    {
        GardnerRobot garbot = new GardnerRobot(2,2,South,28);
        garbot.plantGarden();
        garbot.move();
        garbot.move();
        garbot.move();
        garbot.move();
        garbot.turnOff();
    }
    
    static
    {
        World.reset();
        World.readWorld("ch3_ll.kwld");
        World.setDelay(20);
        World.setVisible(true);
    }
}