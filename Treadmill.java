public class Treadmill extends Robot implements GymEquipment {
  int addbuff = 0;
  int durability = 0;
  
  public WeightsEquipment(int r, int c, Direction d, int b, int add, int dur)
  {
    super(r,c,d,b);
    addbuff = add;
    durability = dur;
  }
  
  public void getUsed(GymBot a) {
    a.workout(addbuff);
    durability = durability - 1;
  }
}