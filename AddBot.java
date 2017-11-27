import kareltherobot.*;
import java.awt.Color;

public class AddBot extends Robot implements Directions, MathBot 
{
  //private int pileOne;
  //private int pileTwo;
  //public void moveTwo();
  //public void lookForPileOne();
  //public void lookForPileTwo();
  //public void binaryOp();
  
  private int pileOne = 0;
  private int pileTwo = 0;
  
  public AddBot (int r, int c, Direction d, int b, int p1, int p2) {
    super(r,c,d,b);
  }
  
  public void moveTwo() {
    move();
    move();
  }
  
  public void lookForPileOne() {
    while (nextToABeeper()) {
      pileOne++;
    }
  }
  
  public void lookForPileTwo() {
    while (nextToABeeper()) {
      pileTwo++;
    }
  }
  
  public void binaryOp() {
    for(int i = 0; i < pileOne+pileTwo; i++) {
      putBeeper();
    }
  }
      
  
}