import kareltherobot.*;

public class DartLeft implements Strategy
{
  
  public void doIt(UrRobot r)
  {
    r.turnLeft();
    r.move();
  }
  }