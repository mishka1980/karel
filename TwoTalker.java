import kareltherobot.*;
import java.awt.Color;

public class TwoTalker extends UrRobot implements RobotArmyInt {
  
  private RobotArmyInt neighbor1 = null;
  private RobotArmyInt neighbor2 = null;
  
  public TwoTalker( int street, int ave, Direction direction, int beepers, RobotArmyInt aRobot, RobotArmyInt bRobot)
  {
    super(street, ave, direction, beepers);
    neighbor1= aRobot;
    neighbor2 = bRobot;
  
  }
  
  public void distributeBeepers()
  {
    neighbor2.distributeBeepers();
    neighbor1.distributeBeepers();
    putBeeper();
    move();
  }
  
  
  
}
