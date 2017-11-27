import kareltherobot.*;
  
public class Killer implements Strategy
{
  
  private int n;
  n = 0;
  
  public void doIt(UrRobot r)
  {
    
    Murderer R = (Murderer) r;
    if (n == 0) {
    R.stab();
    n++;
    } else {
      R.run();
  }
  }
  
  
  

