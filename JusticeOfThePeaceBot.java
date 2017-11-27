import kareltherobot.*;
import java.awt.Color;


public class JusticeOfThePeaceBot extends UrRobot {
  public JusticeOfThePeaceBot(int r, int c, Direction d, int b) {
    super(r,c,d,b);
  }
  
  public boolean marry(Partner a, Partner b) {
    LBot aprime = (LBot) a;
    LBot bprime = (LBot) b;
    
    if (aprime.isAvailible() &&  bprime.isAvailible()) {
      aprime.setPartner(b);
      bprime.setPartner(a);
      return true;
    } else {
      return false;
    }
  }  
  
}