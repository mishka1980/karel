import kareltherobot.*;
import java.awt.Color;

public class Courting implements Strategy {
  private Partner object = null;
  
  public Courting(Partner x) {
    object = x;
  }
  
  public void doIt(UrRobot r){
    
    LBot rice = (LBot) r;
    
    if (object.isAvailible()) {
      rice.move();
      rice.putBeeper();
    }
    
  }
}