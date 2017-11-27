import kareltherobot.*;

public class CornerLayer implements Strategy
{
  private int cornerHeight = 0;
  
  public CornerLayer(int n) {
    cornerHeight = n;
  }
  
  public void doIt(UrRobot r)
  {
    for( int i = 0; i < cornerHeight-1; i++) {
      r.putBeeper();
    }
    r.turnLeft();
  }
}