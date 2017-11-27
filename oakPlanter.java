 import kareltherobot.*;
import java.awt.Color;

public class oakPlanter extends UrRobot implements Forester {
  public void doPlanting() {
    putBeeper();
    putBeeper();
    putBeeper();
    putBeeper();
    putBeeper();
    putBeeper();
    putBeeper();
  }
  public oakPlanter(int r, int c, Direction d, int b)
  {  
    super(r, c, d, b); 
  }
}
