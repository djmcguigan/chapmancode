import kareltherobot.*;

public class Driver implements Directions
{
    public static void main(String[] args)
    {
        MazeWalker driver = new MazeWalker(1,1,East,0);
        while (! driver.nextToABeeper())
        {
            driver.followWallRight();
        }
        driver.turnLeft();
        driver.pickBeeper();
        driver.turnOff();
    }
    
    static
    {
        World.reset();
        World.readWorld("maze2.kwld");
        World.setDelay(1);
        World.setVisible(true);
    }
}