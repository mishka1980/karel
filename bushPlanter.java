import kareltherobot.*;
import java.awt.Color;

public class bushPlanter extends UrRobot implements Forester {
  public void doPlanting() {
    putBeeper();
  }
  
  
  
  public bushPlanter(int r, int c, Direction d, int b)
  {  
    super(r, c, d, b); 
  }
}
