package units;

public abstract class Voin extends Character{
int armor;
  public Voin(String name, int x, int y) {
    super(name, 7, 7, 5,5, 2, 2, x, y);
    this.armor = 5;
  }
}