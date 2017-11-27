import kareltherobot.*;
import java.awt.Color;

public class Choreographer extends UrRobot implements Directions {
  private UrRobot a;
  private UrRobot b;
  private UrRobot c;
  private int beeperBucket;
  
  public Choreographer (int r, int col, Direction d, int beep) {
    super(r,col,d,beep);
    a = new UrRobot(r+1, col+1, d, beep);
    b = new UrRobot(r+2, col+2, d, beep);
    c = new UrRobot(r+3, col+3, d, beep);
  }
  
  public void move() {
   super.move();
   a.move();
   b.move();
   c.move();
  }
  
  public void turnLeft() {
   super.turnLeft();
   a.turnLeft();
   b.turnLeft();
   c.turnLeft();
  }
    
  
  public void pickBeeper() {
    super.pickBeeper();
    a.pickBeeper();
    b.pickBeeper();
    c.pickBeeper();
  }
  
  public void moveDiag() {
    super.move();
    super.turnLeft();
    super.turnLeft();
    super.turnLeft();
    super.move();
    super.turnLeft();
    a.move();
    a.turnLeft();
    a.turnLeft();
    a.turnLeft();
    a.move();
    a.turnLeft();
    
    b.move();
    b.turnLeft();
    b.turnLeft();
    b.turnLeft();
    b.move();
    b.turnLeft();
    
    c.move();
    c.turnLeft();
    c.turnLeft();
    c.turnLeft();
    c.move();
    c.turnLeft();
    
  }
  
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig3-5.kwld");
    World.setVisible(true);
    World.setDelay(0);
    //World.showSpeedControl(true);
    Choreographer boss = new Choreographer(5,2,East,7);
    boss.move();
    boss.pickBeeper();
    boss.moveDiag();
    boss.pickBeeper();
    boss.moveDiag();
    boss.pickBeeper();
    boss.moveDiag();
    boss.pickBeeper();
    boss.moveDiag();
    
  }
  
}