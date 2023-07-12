package units;

import java.util.ArrayList;

public class Monk extends Caster{
  public Monk(String name, int x, int y) {
    super(name, x, y);
  }

  @Override
  public void step(ArrayList<Character> team, ArrayList<Character> team2){
    Character nearestFoe = findNearest(team);
  }
}