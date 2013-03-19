import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper parkerOnTheRun = new Jumper();
        parkerOnTheRun.setColor(Color.BLUE);
        Rock stone = new Rock();
        Rock boulder = new Rock();
        world.add(new Location(5, 6), stone);
        world.add(new Location(3, 0), boulder);
        world.add(new Location(7, 8), parkerOnTheRun);
        world.show();
    }
}