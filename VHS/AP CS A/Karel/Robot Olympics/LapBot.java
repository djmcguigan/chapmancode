import kareltherobot.*;
import java.awt.*;

public class LapBot implements Directions{
    public static void main(String[] args){
        BetterTurnerRobot bolt = new BetterTurnerRobot(1,9,East,0);
        
        //bolt.setColor(Color.blue);
        bolt.move();
        bolt.turnLeft();
        for(int r = 1; r < 10; r++)
            bolt.move();
        bolt.turnLeft();
        for(int t = 1; t < 10; t++)
            bolt.move();
        bolt.turnLeft();
        for(int l = 1; l < 10; l++)
            bolt.move();
        bolt.turnLeft();
        for(int b = 1; b < 10; b++)
            bolt.move();
        bolt.turnLeft();
        bolt.turnOff();
    }
    
    static{
        World.reset();
        World.setDelay(7);
        World.setVisible(true);
    }
}