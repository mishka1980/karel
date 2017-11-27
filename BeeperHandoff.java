import kareltherobot.*;
import java.awt.Color;

public class BeeperHandoff implements Directions {
  public static void main (String[] args)
  {
    World.readWorld("worlds/ex2-11.kwld");
    World.setVisible(true);
    World.setDelay(100);
    UrRobot eddie = new UrRobot(1, 1, East, 1, Color.RED);
    UrRobot claire = new UrRobot (1, 4, North, 0, Color.BLUE);
    eddie.move();
    eddie.move();
    eddie.move();
    eddie.putBeeper();
    eddie.turnLeft();
    eddie.turnLeft();
    eddie.move();
    eddie.move();
    eddie.move();
    claire.pickBeeper();
    claire.move();
    claire.move();
    claire.putBeeper();
    claire.turnLeft();
    claire.turnLeft();
    claire.move();
    claire.move();
    claire.turnOff();
    eddie.turnOff();
  }

}
