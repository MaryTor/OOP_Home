package units;

import java.util.ArrayList;

public class Arbalester extends Bowman{
  public Arbalester(String name, int x, int y) {
    super(name, x, y);
  }


  @Override
  public void step(ArrayList<Character> team, ArrayList<Character> team2){
    Character nearestFoe = findNearest(team);
  }

}