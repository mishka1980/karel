import kareltherobot.*;
import java.awt.Color;

public class MaplePlanter extends UrRobot implements Forester {
  public void doPlanting() {
    putBeeper();
    putBeeper();
    putBeeper();
    putBeeper();
  }
  public MaplePlanter(int r, int c, Direction d, int b)
  {  
    super(r, c, d, b); 
  }
}
