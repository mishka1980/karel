import kareltherobot.*;
import java.awt.Color;

public class threeMover extends teamPlayer implements Directions {
  
  public threeMover(int r, int c, Direction d, int b) {
    super(r,c,d,b);
  }
  
  public void moveNecessary() {
    move();
    move();
    move();
  }
}