import units.*;
import units.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    ArrayList<Character> teamOne = new ArrayList<>();
    ArrayList<Character> teamTwo = new ArrayList<>();
    ArrayList<Character> team = new ArrayList<>();
    fillList(teamOne, 0);
    fillList(teamTwo, 9);
    team.addAll(teamOne);
    team.addAll(teamTwo);
    team.sort(Comparator.comparingInt(Character::getInitiative));
    teamOne.forEach(n -> System.out.println(n.getInfo()));
    teamTwo.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("-----");
    for (Character c : team) {
      if (teamOne.contains(c)) {
        c.step(teamTwo, teamOne);
      } else {
        c.step(teamOne, teamTwo);
      }
      System.out.println("team1");
      teamOne.forEach(n -> System.out.println(n.getInfo()));
      System.out.println("team2");
      teamTwo.forEach(n -> System.out.println(n.getInfo()));
    }
  }


    public static void fillList (ArrayList <Character> list, int xPosition) {
      for (int i = 0; i < 10; i++) {
        int cnt = new Random().nextInt(0, 7);
        switch (cnt) {
          case 0: {
            list.add(new Arbalester("arbalester", xPosition, i));
            break;
          }
          case 1: {
            list.add(new Rustic("rustic", xPosition, i));
            break;
          }
          case 2: {
            list.add(new Wizard("wizard", xPosition, i));
            break;
          }
          case 3: {
            list.add(new Monk("monk", xPosition, i));
            break;
          }
          case 4: {
            list.add(new Robber("robber", xPosition, i));
            break;
          }
          case 5: {
            list.add(new Sniper("sniper", xPosition, i));
            break;
          }
          default: {
            list.add(new Kopeyshchik("kopeyshchik", xPosition, i));
            break;
          }
        }
      }
    }
  }