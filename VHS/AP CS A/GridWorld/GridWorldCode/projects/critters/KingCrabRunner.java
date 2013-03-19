import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrabRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        KingCrab kingOfTheNoobs = new KingCrab();
        world.add(new Location(5, 5), kingOfTheNoobs);
        world.add(new Location(4, 4), new Rock());
        world.add(new Location(4, 5), new Actor());
        world.add(new Location(4, 6), new Rock());
        world.show();
    }
}