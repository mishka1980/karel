import kareltherobot.*;
import java.awt.Color;

public class Oct24 implements Directions {
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(1);
    //World.showSpeedControl(true);
    twoMover jeff = new twoMover(1,2,East, 3);
    jeff.putBeeper();
    jeff.moveNecessary();
    jeff.putBeeper();
    jeff.moveNecessary();
    jeff.putBeeper();
    jeff.move();
    jeff.turnOff();
    
    threeMover lexi = new threeMover(3,2,East,3);
    lexi.putBeeper();
    lexi.moveNecessary();
    lexi.putBeeper();
    lexi.moveNecessary();
    lexi.putBeeper();
    lexi.moveNecessary();
    lexi.putBeeper();
    lexi.turnOff();
    
    threeMover eddie = new threeMover(5,2,East,3);
    eddie.putBeeper();
    eddie.moveNecessary();
    eddie.putBeeper();
    eddie.moveNecessary();
    eddie.putBeeper();
    eddie.moveNecessary();
    eddie.putBeeper();
    eddie.turnOff();
  }
  
}
