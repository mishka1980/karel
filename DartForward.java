import kareltherobot.*;

public class DartForward implements Strategy
{
  
  public void doIt(UrRobot r)
  {
    r.move();
    r.move();
    r.move();
  }
  }