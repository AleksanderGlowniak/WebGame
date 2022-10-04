package my.game.enemies;

public class Easterling extends Character {

    private int damageBySun;

    public Easterling(int hitPoints, int initiative, String name) {
        super(hitPoints, initiative, name);
    }

    public Easterling() {
        super();
    }

    public int getDamageBySun() {
        return damageBySun;
    }

    public void setDamageBySun(int damageBySun) {
        this.damageBySun = damageBySun;
    }
}
