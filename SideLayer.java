import kareltherobot.*;

public class SideLayer implements Strategy
{
  private int sidelength = 0;
  public SideLayer(int n) {
    sidelength = n;
  }
  
  public void doIt(UrRobot r)
  {
    for( int i = 0; i < sidelength-1; i++) {
      r.putBeeper();
      r.move();
  }
  }
}