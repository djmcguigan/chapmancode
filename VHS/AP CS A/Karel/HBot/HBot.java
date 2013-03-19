import kareltherobot.*;

public class HBot implements Directions
{
    public static void main (String[] args)
    {
        UrRobot hBot = new UrRobot(1,1,North,infinity);
        hBot.putBeeper();
        hBot.move();
        hBot.putBeeper();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.move();
        hBot.turnLeft();
        hBot.move();
        hBot.putBeeper();
        hBot.move();
        hBot.turnLeft();
        hBot.putBeeper();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.move();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.move();
        hBot.move();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.turnOff();
    }
    
    static
    {
        World.reset();
        // World.readWorld("firstday.kwld");
        World.setDelay(20);
        World.setVisible(true);
    }
}