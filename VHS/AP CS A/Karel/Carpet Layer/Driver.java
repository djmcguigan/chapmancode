import kareltherobot.*;

public class Driver implements Directions
{
    public static void main(String[] args)
    {
        CarpetLayer roomba = new CarpetLayer(1,1,East,8);
        roomba.moveLeft();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveTo();
        roomba.checkRoom();
        roomba.moveLeft();
        roomba.turnOff();
    }
    
    static
    {
        World.reset();
        World.readWorld("ch5_11.kwld");
        World.setDelay(5);
        World.setVisible(true);
    }
}