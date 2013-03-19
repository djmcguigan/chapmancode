import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter
{
    public void processActors(ArrayList <Actor> actors)
    {
        Grid gr = getGrid();
        Location loc = getLocation();
        
        for(Actor a : actors)
        {
            Location loc1 = a.getLocation();
            Location loc2 = loc1.getAdjacentLocation(loc.getDirectionToward(loc1));
            if(gr.isValid(loc2))
            {
                a.moveTo(loc2);
            }
            else
            {
                a.removeSelfFromGrid();
            }
        }
    }
}