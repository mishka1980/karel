import kareltherobot.*;
import java.awt.Color;

public class PrettyBoxBot extends UrRobot {
  private Strategy temp = null;
  private Strategy strat1 = null;
  private Strategy strat2 = null;
  public PrettyBoxBot(int r, int c, Direction d, int beep, Strategy cornerStrat, Strategy sideStrat)
  {
    super(r,c,d,beep);
    strat1= cornerStrat;
    strat2 = sideStrat;
  }
  
  public void doStrat()
  {
    strat1.doIt(this);
  }
  
  public void changeStrat() {
    temp = strat1;
    strat1 = strat2;
    strat2 = temp;
    
  }
  
  public void boxBuild() {
    for (int f = 0; f < 9; f++) {
    this.doStrat();
    this.changeStrat();
    }
  }
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(10);
    
    PrettyBoxBot kilo = 
      new PrettyBoxBot(2,2,South,infinity, new CornerLayer(9), new SideLayer(5));
    kilo.boxBuild();
    kilo.move();
    kilo.turnOff();
    kilo.setVisible(false);
    kilo = new PrettyBoxBot(1, 1, East, infinity, new CornerLayer(11), new SideLayer(7));
    kilo.boxBuild();
    kilo.turnOff();
    kilo.setVisible(false);
  }
  
}
