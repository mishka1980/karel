import kareltherobot.*;
import java.awt.Color;

public abstract class teamPlayer extends UrRobot implements Directions{
  
  public abstract void moveNecessary();
  
  public teamPlayer(int r, int c, Direction d, int b)
  {  
    super(r, c, d, b); 
  }
  
  public void doWork() {
   putBeeper();
   moveNecessary();
   putBeeper();
   moveNecessary();
   putBeeper();
  }
   
  
}
