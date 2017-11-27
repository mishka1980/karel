import kareltherobot.*;
import java.awt.Color;

public class twoMover extends teamPlayer implements Directions {
  
  public twoMover(int r, int c, Direction d, int b) {
    super(r,c,d,b);
  }
  
  public void moveNecessary() {
    move();
    move();
  }
}
