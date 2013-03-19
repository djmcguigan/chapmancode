import kareltherobot.*;

public class FigureEight implements Directions
{
    public static void main (String[] args)
    {
        BetterTurnerRobot skater = new BetterTurnerRobot(3,5,North,0);
        int i = 50;
        
        skater.turnLeft();
        while(i > -1){
            skater.move();
            skater.turnRight();
            skater.move();
            skater.move();
            skater.turnRight();
            skater.move();
            skater.move();
            skater.turnLeft();
            skater.move();
            skater.move();
            skater.turnLeft();
            skater.move();
            skater.move();
            skater.turnLeft();
            skater.move();
            skater.move();
            skater.turnLeft();
            skater.move();
            skater.move();
            skater.turnRight();
            skater.move();
            skater.move();
            skater.turnRight();
            skater.move();
            i--;
        }
        skater.turnRight();
        skater.turnOff();
        
    }
    
    static
    {
        World.reset();
        World.readWorld("ch2_9.kwld");
        World.setDelay(1);
        World.setVisible(true);
    }
}