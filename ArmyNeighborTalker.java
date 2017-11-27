import kareltherobot.*;
import java.awt.Color;

public class ArmyNeighborTalker extends UrRobot implements RobotArmyInt {
  
  private RobotArmyInt neighbor = null;
  
  public ArmyNeighborTalker( int street, int ave, Direction direction, int beepers, RobotArmyInt aRobot)
  {
    super(street, ave, direction, beepers);
    neighbor= aRobot;
  }
  
  public void distributeBeepers()
  {
    neighbor.distributeBeepers();
    putBeeper();
    move();
  }
  
  
  
}
