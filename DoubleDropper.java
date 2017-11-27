import kareltherobot.*;
import java.awt.Color;

public class DoubleDropper extends UrRobot implements Directions
{
  public DoubleDropper (int r, int c, Direction d, int b) {
    super(r,c,d,b);
  }
  
  @Override
  public void putBeeper() {
   super.putBeeper();
   super.putBeeper();
  }
  
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig1-2a.kwld");
    World.setVisible(true);
    World.setDelay(100);
    //World.showSpeedControl(true);
    
    DoubleDropper jeff = new DoubleDropper(2,2,East, 5);
      jeff.move();
      jeff.putBeeper();
      jeff.turnLeft();
      jeff.move();
  }
}