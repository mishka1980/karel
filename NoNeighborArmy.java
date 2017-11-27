import kareltherobot.*;
import java.awt.Color;

public class NoNeighborArmy extends UrRobot implements RobotArmyInt {
  
  
  public void distributeBeepers() {
    putBeeper();
    move();
  }
  
  public NoNeighborArmy(int street, int avenue, Direction direction, int beepers)
  {
    super(street, avenue, direction, beepers);
  }
  public static void main (String[] args)
  {
    World.setVisible(true);
    World.setDelay(10);
    //World.showSpeedControl(true);
    
    RobotArmyInt robotSix = new NoNeighborArmy(1,6, North, 1);
    RobotArmyInt robotFive = new ArmyNeighborTalker(1,5, North, 1, robotSix);
    RobotArmyInt robotFour = new NoNeighborArmy(1, 4, North, 1);
    RobotArmyInt robotThree = new NoNeighborArmy(1, 3, North, 1);
    RobotArmyInt robotTwo = new TwoTalker(1, 2, North, 1, robotFour, robotFive);
    RobotArmyInt robotOne = new TwoTalker(1, 1, North, 1, robotTwo, robotThree);
    
    robotOne.distributeBeepers();
  }
  
}