import kareltherobot.*;
import java.awt.Color;

public class PlantersCongolmerate implements Directions {
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(1);
    
    oakPlanter jeff = new oakPlanter(3,3,East, 14);
    jeff.doPlanting();
    jeff.move();
    jeff.move();
    jeff.move();
    jeff.move();
    jeff.move();
    jeff.doPlanting();
    jeff.move();
    jeff.turnOff();
    
    MaplePlanter eddie = new MaplePlanter(5,5, North, 7);
    eddie.doPlanting();
    eddie.move();
    eddie.turnOff();
    bushPlanter claire = new bushPlanter(5,6,North, 3);
    claire.doPlanting();
    claire.move();
    claire.turnOff();
  }
  
}
