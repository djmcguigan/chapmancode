import kareltherobot.*;

public class Driver implements Directions
{
    public static void main(String[] args)
    {
        BeeperLayer driver = new BeeperLayer(1,1,East,0);
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.move();
        driver.turnLeft();
        driver.harvestBeeps();
        driver.goToOrigin();
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.moveNext();
        driver.plantBeeps();
        driver.goBack();
        driver.move();
        driver.harvestBeeps();
        driver.goToOrigin();
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.moveNext();
        driver.plantBeeps();
        driver.goBack();
        driver.move();
        driver.harvestBeeps();
        driver.goToOrigin();
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.moveNext();
        driver.plantBeeps();
        driver.goBack();
        driver.move();
        driver.harvestBeeps();
        driver.goToOrigin();
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.moveNext();
        driver.plantBeeps();
        driver.goBack();
        driver.move();
        driver.harvestBeeps();
        driver.goToOrigin();
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.moveNext();
        driver.plantBeeps();
        driver.goBack();
        driver.move();
        driver.harvestBeeps();
        driver.goToOrigin();
        driver.measure();
        driver.turnAround();
        driver.move();
        driver.turnRight();
        driver.moveNext();
        driver.plantBeeps();
        driver.goBack();
        driver.turnOff();
    }
    
    static
    {
        World.reset();
        World.readWorld("ch6_25.kwld");
        World.setDelay(10);
        World.setVisible();
    }
}