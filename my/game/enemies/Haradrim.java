package my.game.enemies;

public class Haradrim extends Character {

    private int damageBySun;

    public Haradrim(int hitPoints, int initiative, String name) {
        super(hitPoints, initiative, name);
    }

    public Haradrim() {
        super();
    }

    public int getDamageBySun() {
        return damageBySun;
    }

    public void setDamageBySun(int damageBySun) {
        this.damageBySun = damageBySun;
    }
}
