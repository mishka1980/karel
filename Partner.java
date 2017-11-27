import kareltherobot.*;
import java.awt.Color;

public interface Partner {
  public UrRobot spouse();
  public void setPartner(Partner x);
  public boolean isAvailible();
}