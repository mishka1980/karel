import kareltherobot.*;
import java.awt.Color;


public class FishBot extends UrRobot{
  
  private Strategy temp = null;
  private Strategy strat1 = null;
  private Strategy strat2 = null;
  
  public FishBot(int r, int c, Direction d, int beep, Strategy s1, Strategy s2)
  {
    super(r,c,d,beep);
    strat1= s1;
    strat2 = s2;
  }
  
  public void startle()
  {
    strat1.doIt(this);
  }
  
  public void swapStrat() {
    temp = strat1;
    strat1 = strat2;
    strat2 = temp; 
  }
  
  
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(10);
    FishBot kilo = 
      new FishBot(7,7,West,infinity, new DartLeft(), new DartForward());
    kilo.startle();
    kilo.swapStrat();
    kilo.startle();
    kilo.swapStrat();
    kilo.startle();
  }
  
}
