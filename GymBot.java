import kareltherobot.*;
import java.awt.Color;

public class GymBot extends Robot implements Directions {
  
  int health = 0;
  public GymBot(int r, int c, Direction d, int b, int h) {
    super(r,c,d,b);
    health = h;
  }
  
  public void workout(int a) {
    health = health + a;
  }
  
  public void quitworkout() {
    if (nextToARobot()) {
      turnleft();
      turnleft();
      move();
    }
  }
}