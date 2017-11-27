import kareltherobot.*;
import java.awt.Color;

public class GroceryPickup implements Directions {
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig2-10.kwld");
    World.setVisible(true);
    World.setDelay(100);
   (new GroceryPickup()).doWork();
  }
  
  
  public void doWork () {
    int adamRow=5; 
    int adamCol=7;
    int adamBeepers=0;
    
    World.setVisible(true);
    World.setDelay(100);
    UrRobot adam = new UrRobot(adamRow,adamCol,East,
                               adamBeepers,
                               Color.GREEN);
    
    adam.turnLeft();
    adam.turnLeft();
    adam.move();
    adam.move();
    adam.pickBeeper();
    adam.move();
    adam.turnLeft();
    adam.turnLeft();
    adam.turnLeft();
    adam.move();
    adam.pickBeeper();
    adam.turnLeft();
    adam.move();
    adam.turnLeft();
    adam.turnLeft();
    adam.turnLeft();
    adam.move();
    adam.pickBeeper();
    adam.move();
    adam.pickBeeper();
    adam.turnLeft();
    adam.turnLeft();
    adam.move();
    adam.move();
    adam.move();
    adam.turnLeft();
    adam.move();
    adam.move();
    adam.move();
    adam.move();
    adam.turnOff();
  }
}
