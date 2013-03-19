import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug mcguigy = new SpiralBug(6);
        mcguigy.setColor(Color.GREEN);
        world.add(new Location(9, 9), mcguigy);
        world.show();
    }
}