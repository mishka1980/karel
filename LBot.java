import kareltherobot.*;
import java.awt.Color;


public class LBot extends UrRobot implements Partner {
    private Partner significantOther = null;
    
    public LBot(int r, int c, Direction d, int b, Partner p) {
     super(r,c,d,b);
        significantOther = p;
   } 
    public UrRobot spouse() {
        UrRobot spousey = (UrRobot) significantOther;
        return spousey;
    }
    
    public void setPartner(Partner x) {
        significantOther = x;
    }
    
    public boolean isAvailible() {
      return (significantOther == null);
    }
    
  }