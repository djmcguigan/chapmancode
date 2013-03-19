import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CircleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug mcguigy = new CircleBug(6);
        mcguigy.setColor(Color.GREEN);
        world.add(new Location(7, 8), mcguigy);
        world.show();
    }
}