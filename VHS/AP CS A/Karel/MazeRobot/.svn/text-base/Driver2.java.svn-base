import kareltherobot.*;

public class Driver2 implements Directions
{
    public static void main(String[] args)
    {
        MazeWalker driver = new MazeWalker(2,3,East,0);
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
        World.readWorld("maze.kwld");
        World.setDelay(1);
        World.setVisible(true);
    }
}