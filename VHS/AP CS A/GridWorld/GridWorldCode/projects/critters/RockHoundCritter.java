import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class RockHoundCritter
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        RockHound num = new RockHound();
        RockHound blah = new RockHound();
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(4, 4), new RockHound());
        world.add(new Location(5, 8), new RockHound());
        world.show();
    }
}