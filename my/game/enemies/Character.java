package my.game.enemies;

import java.util.Objects;

public class Character {

   private int hitPoints;
   private int initiative;
   private String name;

    public Character(int hitPoints, int initiative, String name) {
        this.hitPoints = hitPoints;
        this.initiative = initiative;
        this.name = name;
    }

    public Character() {

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
