package my.game.enemies;

import my.game.enums.Places;
import my.game.enums.Weapons;
import my.game.exceptions.ToShortHeroNameException;

public class Hero extends Character{

    private Weapons weapon;
    private Places visitedPlace;

    public Hero() {
        this.weapon = weapon;
        this.visitedPlace = visitedPlace;
    }

    public Hero(int hitPoints, int initiative, String name, String weapon, String visitedPlace) {
        super(hitPoints, initiative, name);
        this.weapon = Weapons.valueOf(weapon);
        this.visitedPlace = Places.valueOf(visitedPlace);
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = Weapons.valueOf(String.valueOf(weapon));
    }

    public String getVisitedPlace() {
        return visitedPlace.name();
    }

    public void setVisitedPlace(Places visitedPlace) {
        this.visitedPlace = Places.valueOf(String.valueOf(visitedPlace));
    }

    @Override
    public void setName(String name) {
        if (name.length()<3){
            throw new ToShortHeroNameException();
        }
        super.setName(name);
    }
}
